package br.com.setebit.delivery.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.FiltroPaginacaoDTO;
import br.com.setebit.delivery.dto.ProdutoDTO;
import br.com.setebit.delivery.mode.entity.Produto;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/delivery/produto/")
@CrossOrigin(origins = "*")
@Api(value = "API rest produto")
public class ProdutoController extends AbstractController<Produto, Integer, ProdutoDTO> {

	@Autowired
	private ProdutoService service;

	@Override
	protected BaseService<Produto, Integer> getService() {
		return service;
	}

	@Override
	protected Class<ProdutoDTO> getDtoClass() {
		return ProdutoDTO.class;
	}

	@Override
	protected Class<Produto> getEntityClass() {
		return Produto.class;
	}

	@RequestMapping(value = "pesquisar", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
	@ApiOperation(value="retorna a lista de produtos")
	public Page<Produto> pesquisar(HttpServletResponse resp, @RequestBody FiltroPaginacaoDTO dto) {
		try {
			return service.pesquisa(dto);
		} catch (Exception e) {
			System.out.println("ocorreu um erro ");
		}
		return null;
	}
	
	@RequestMapping(value = "pesquisar", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	public String pesquisar(HttpServletResponse resp) {
		try {
			return "ok";
		} catch (Exception e) {
			System.out.println("ocorreu um erro ");
		}
		return null;
	}
}
