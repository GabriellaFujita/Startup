package br.com.fiap.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.startup.model.*;
import br.com.fiap.startup.repository.*;


@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {

  @Autowired
	private EnderecoRepository enderecoRepository;

  @GetMapping()
  public List<Endereco> localizacoes() {
   return enderecoRepository.findAll();
 }

  @GetMapping("/{id}")
  public Endereco localizarPorId(@PathVariable int id) {
   return enderecoRepository.findById(id).get();
 }

 @PostMapping
 public Endereco criarLocalizacao(@RequestBody Endereco endereco) {
   return enderecoRepository.save(endereco);
 }

 @PatchMapping("/{id}")
 public Endereco atualizarLocalizacao(@PathVariable int id, @RequestBody Endereco endereco) throws Exception {
     return enderecoRepository.findById(id).map( enderecoEntity -> {

         enderecoEntity.setCep(endereco.getCep());
         enderecoEntity.setLogradouro(endereco.getLogradouro());
         return enderecoRepository.save(enderecoEntity);

     }).orElseThrow( () -> new Exception("400 - Endereço não encontrado"));

 }
}
