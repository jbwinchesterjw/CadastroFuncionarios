package br.com.cadastro.dao;

import java.util.List;

import br.com.cadastro.domain.Departamento;


public interface IDepartamentoDao {
	void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
