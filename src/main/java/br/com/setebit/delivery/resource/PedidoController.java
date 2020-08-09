package br.com.setebit.delivery.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.FiltroPaginacaoDTO;
import br.com.setebit.delivery.dto.PedidoDTO;
import br.com.setebit.delivery.mode.entity.Pedido;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.PedidoService;
import br.com.setebit.delivery.util.RelatorioUtil;
import io.swagger.annotations.ApiOperation;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@RestController
@RequestMapping("/delivery/pedido/")
public class PedidoController extends AbstractController<Pedido, Integer, PedidoDTO> {

	@Autowired
	private RelatorioUtil relatorioUtil;

	@Autowired
	private PedidoService service;

	@Override
	protected BaseService<Pedido, Integer> getService() {
		return service;
	}

	@Override
	protected Class<PedidoDTO> getDtoClass() {
		return PedidoDTO.class;
	}

	@Override
	protected Class<Pedido> getEntityClass() {
		return Pedido.class;
	}

	@RequestMapping(value = "/comandaPdf/{id}", method = RequestMethod.GET)
	public ResponseEntity<byte[]> pedidoPdf(HttpServletResponse response, @PathVariable("id") Integer id)
			throws JRException, SQLException, IOException {
		System.out.println("########## getPDF");
		try {

			JasperPrint jasperPrint = relatorioUtil.gerarPdf(id, "pedido.jrxml");
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "inline; filename=Relatorio.pdf");
			// Faz a exportação do relatório para o HttpServletResponse
			final OutputStream outStream = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);

			byte[] output = JasperExportManager.exportReportToPdf(jasperPrint);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.parseMediaType("application/pdf"));
			String filename = "pedido.pdf";
			headers.setContentDispositionFormData(filename, filename);
			ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(output, headers, HttpStatus.OK);

			return responseEntity;
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
		return null;
	}

	@RequestMapping(value = "pesquisar", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
	@ApiOperation(value = "retorna a lista de produtos")
	public Page<Pedido> pesquisar(HttpServletResponse resp, @RequestBody FiltroPaginacaoDTO dto) {
		try {
			return service.pesquisa(dto);
		} catch (Exception e) {
			System.out.println("ocorreu um erro ");
		}
		return null;
	}

}
