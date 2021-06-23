package br.com.cadastro.dao;

import java.util.List;

import br.com.cadastro.domain.Cargo;


public interface ICargoDao {

	void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
