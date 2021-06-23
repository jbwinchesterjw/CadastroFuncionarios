package br.com.cadastro.service;

import java.time.LocalDate;
import java.util.List;

import br.com.cadastro.domain.Funcionario;


public interface IFuncionarioService {

	void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);
	
	List<Funcionario> buscarPorDatas(LocalDate entrada, LocalDate saida);
}
