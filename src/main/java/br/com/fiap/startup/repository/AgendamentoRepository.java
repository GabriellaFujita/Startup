package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

}
