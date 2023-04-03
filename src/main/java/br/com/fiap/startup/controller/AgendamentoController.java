package br.com.fiap.startup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import br.com.fiap.startup.model.Agendamento;
import br.com.fiap.startup.model.Horario;
import br.com.fiap.startup.model.PrestadorDeServico;
import br.com.fiap.startup.repository.AgendamentoRepository;
import br.com.fiap.startup.repository.ClienteRepository;
import br.com.fiap.startup.repository.DadosRepository;
import br.com.fiap.startup.repository.EnderecoRepository;
import br.com.fiap.startup.repository.HorarioRepository;
import br.com.fiap.startup.repository.PrestadorRepository;
import br.com.fiap.startup.repository.ServicoRepository;
import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("agendamento")
public class AgendamentoController {
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	@Autowired
	private HorarioRepository horarioRepository;
	
	
	@GetMapping
	public List<Agendamento> listar() {
		return agendamentoRepository.findAll();
	}
	@GetMapping({"codigo"})
	 public  Horario buscarHorario(@PathVariable int codigo) {
		return horarioRepository.findById(codigo).get();
	}
	
	@ResponseStatus(code = HttpStatus.CREATED);
	
	@PostMapping
	public Agendamento agendar(@RequestBody Agendamento agendamento) {
		return agendamento.save(agendamento);
	}
	
	@DeleteMapping ({"codigo"})
	public void remover (@PathVariable int codigo) {
		horarioRepository.deleteById(codigo);
	}
	
	

}
