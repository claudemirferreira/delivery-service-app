package br.com.setebit.delivery.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.ItemDTO;
import br.com.setebit.delivery.dto.PedidoProdutoDTO;
import br.com.setebit.delivery.mode.entity.PedidoProduto;
import br.com.setebit.delivery.response.Response;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.PedidoProdutoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/delivery/pedido-produto")
public class PedidoProdutoController extends AbstractController<PedidoProduto, Integer, PedidoProdutoDTO> {

	@Autowired
	private PedidoProdutoService service;

	@Override
	protected Class<PedidoProduto> getEntityClass() {
		return PedidoProduto.class;
	}

	@Override
	protected BaseService<PedidoProduto, Integer> getService() {
		return service;
	}

	@Override
	protected Class<PedidoProdutoDTO> getDtoClass() {
		return PedidoProdutoDTO.class;
	}
	
	@RequestMapping(value = "/item/", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<ItemDTO>> incluirItem(HttpServletResponse resp, @Valid @RequestBody ItemDTO obj) {

		Response<ItemDTO> response = new Response<ItemDTO>();
		try {
			ItemDTO dto = service.incluirItem(obj);
			response.setContent(dto);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(response);
		}
	}
	

	@RequestMapping(value = "pedido/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	@ApiOperation(value = "retorna a lista de produtos")
	public ResponseEntity<Response<List<ItemDTO>>> findByProduto(@PathVariable("id") Integer id) {
		try {
			Response<List<ItemDTO>> response = new Response<List<ItemDTO>>();
			response.setContent(ItemDTO.toDto(service.findByProduto(id)));
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			System.out.println("ocorreu um erro ");
		}
		return null;
	}
}
