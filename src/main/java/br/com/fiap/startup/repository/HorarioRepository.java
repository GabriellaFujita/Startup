package br.com.fiap.startup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startup.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Integer> {

}
