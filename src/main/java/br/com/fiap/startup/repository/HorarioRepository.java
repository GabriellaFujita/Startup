package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Horario;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    List<Horario> findByEstaDisponivelTrue();
}
