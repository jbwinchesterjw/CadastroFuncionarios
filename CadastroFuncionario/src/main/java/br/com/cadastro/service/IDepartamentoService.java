package br.com.cadastro.service;

import java.util.List;

import br.com.cadastro.domain.Departamento;


public interface IDepartamentoService {

	 void salvar(Departamento departamento);

	    void editar(Departamento departamento);

	    void excluir(Long id);

	    Departamento buscarPorId(Long id);
	    
	    List<Departamento> buscarTodos();

		boolean departamentoTemCargos(Long id);
}
