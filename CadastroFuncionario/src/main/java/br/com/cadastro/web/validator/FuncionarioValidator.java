package br.com.cadastro.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.cadastro.domain.Funcionario;


public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

}
