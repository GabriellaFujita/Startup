package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
