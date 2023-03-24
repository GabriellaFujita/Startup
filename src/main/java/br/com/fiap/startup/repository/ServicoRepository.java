package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
