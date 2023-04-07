package br.com.fiap.startup.controller;

import br.com.fiap.startup.model.Agendamento;
import br.com.fiap.startup.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recomendacao")
public class RecomendacaoController {

    @Autowired
    private AgendamentoRepository agendamentoRepository;
    @PatchMapping("/{id}")
    public Agendamento geraRecomendacao(@PathVariable int id, @RequestBody Agendamento agendamento) throws Exception {
        return agendamentoRepository.findById(id).map( agendamentoEntity -> {

            agendamentoEntity.setRecomendacao(agendamento.getRecomendacao());
            return agendamentoRepository.save(agendamentoEntity);

        }).orElseThrow( () -> new Exception("400 - Registro não encontrado"));

    }
}
