package br.com.fiap.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.startup.model.Agendamento;
import br.com.fiap.startup.model.Horario;
import br.com.fiap.startup.repository.AgendamentoRepository;
import br.com.fiap.startup.repository.HorarioRepository;


@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	@Autowired
	private HorarioRepository horarioRepository;
	
	
	@GetMapping
	public List<Agendamento> listar() {
		return agendamentoRepository.findAll();
	}

	@GetMapping("/horarios")
	public List<Horario> horariosDisponiveis(){
		return horarioRepository.findByEstaDisponivelTrue();
	}

	@GetMapping("/{id}")
	 public Horario buscarHorario(@PathVariable int id) {
		return horarioRepository.findById(id).get();
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	
	@PostMapping
	public Agendamento agendar(@RequestBody Agendamento agendamento) {
		return agendamentoRepository.save(agendamento);
	}
	
	@DeleteMapping ("/{id}")
	public void remover (@PathVariable int id) {
		agendamentoRepository.deleteById(id);
	}



	@PatchMapping("/{id}")
	public  Horario atualizaHorario (@PathVariable int id) throws Exception {
		return horarioRepository.findById(id).map( horario -> {

			horario.setEstaDisponivel(false);
			return horarioRepository.save(horario);

		}).orElseThrow( () -> new Exception("400 - Registro não encontrado"));

	}

}
