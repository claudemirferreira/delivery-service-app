package br.com.setebit.delivery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.CaixaDTO;
import br.com.setebit.delivery.mode.entity.Caixa;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.CaixaService;

@RestController
@RequestMapping("/delivery/caixa/")
public class CaixaController extends AbstractController<Caixa, Integer, CaixaDTO> {

	@Autowired
	private CaixaService service;

	@Override
	protected BaseService<Caixa, Integer> getService() {
		return service;
	}

	@Override
	protected Class<CaixaDTO> getDtoClass() {
		return CaixaDTO.class;
	}

	@Override
	protected Class<Caixa> getEntityClass() {
		return Caixa.class;
	}

}
