package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.PrestadorDeServico;

public interface PrestadorRepository extends JpaRepository<PrestadorDeServico, Integer> {

}
