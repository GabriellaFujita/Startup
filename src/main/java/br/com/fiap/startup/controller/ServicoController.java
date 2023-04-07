package br.com.fiap.startup.controller;

import br.com.fiap.startup.model.Servico;
import br.com.fiap.startup.repository.AgendamentoRepository;
import br.com.fiap.startup.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoRepository servicoRepository;

    @GetMapping
    public List<Servico> listarServicos(){
        return servicoRepository.findAll();
    }

}
