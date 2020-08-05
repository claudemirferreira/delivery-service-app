package br.com.setebit.delivery.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.delivery.dto.SangriaDTO;
import br.com.setebit.delivery.mode.entity.Sangria;
import br.com.setebit.delivery.service.BaseService;
import br.com.setebit.delivery.service.SangriaService;

@RestController
@RequestMapping("/delivery/sangria/")
public class SangriaController extends AbstractController<Sangria, Integer, SangriaDTO> {

	@Autowired
	private SangriaService service;

	@Override
	protected BaseService<Sangria, Integer> getService() {
		return service;
	}

	@Override
	protected Class<SangriaDTO> getDtoClass() {
		return SangriaDTO.class;
	}

	@Override
	protected Class<Sangria> getEntityClass() {
		return Sangria.class;
	}

}
