package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Dados;

public interface DadosRepository extends JpaRepository<Dados, Integer> {

}
