package br.com.setebit.delivery.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.PedidoDTO;
import br.com.setebit.delivery.mode.entity.Pedido;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.PedidoService;
import br.com.setebit.delivery.util.RelatorioUtil;
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

	@RequestMapping(value = "/geraPdf", method = RequestMethod.POST)
	public ResponseEntity<byte[]> geraPdf(HttpServletResponse response, @RequestBody PedidoDTO dto)
			throws JRException, SQLException, IOException {
		System.out.println("########## getPDF");
		try {

			System.out.println(dto.toString());

			JasperPrint jasperPrint = relatorioUtil.gerarPdf(dto, "pedido.jasper");
			response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "inline; filename=Relatorio.pdf");
			// Faz a exportação do relatório para o HttpServletResponse
			final OutputStream outStream = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);

			byte[] output = JasperExportManager.exportReportToPdf(jasperPrint);

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.parseMediaType("application/pdf"));
			String filename = "relatorio.pdf";
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
}
