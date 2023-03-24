package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
