package br.com.setebit.delivery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.EntregadorDTO;
import br.com.setebit.delivery.mode.entity.Entregador;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.EntregadorService;

@RestController
@RequestMapping("/delivery/entregador")
public class EntregadorController extends AbstractController<Entregador, Integer, EntregadorDTO> {

	@Autowired
	private EntregadorService service;

	@Override
	protected BaseService<Entregador, Integer> getService() {
		return service;
	}

	@Override
	protected Class<EntregadorDTO> getDtoClass() {
		return EntregadorDTO.class;
	}

//	@RequestMapping(value = "/findAllByNome", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
//	public Page<Entregador> pesquisar(HttpServletRequest request,
//			@RequestBody EntregadorDTO dto,
//			@RequestParam(value = "page", required = false, defaultValue = "0") int page,
//			@RequestParam(value = "size", required = false, defaultValue = "10") int size, BindingResult result) {
//
//		return service.findByNomeLike(dto.getNome(), page, size);
//	}
}
