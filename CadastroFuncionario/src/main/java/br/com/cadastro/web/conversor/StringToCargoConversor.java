package br.com.cadastro.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.cadastro.domain.Cargo;
import br.com.cadastro.service.ICargoService;

@Component
public class StringToCargoConversor implements Converter<String, Cargo> {

	@Autowired
	private ICargoService service;
	
	@Override
	public Cargo convert(String text) {
		if (text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}
}
