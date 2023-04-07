package br.com.fiap.startup;

import br.com.fiap.startup.model.*;
import br.com.fiap.startup.repository.CategoriaRepository;
import br.com.fiap.startup.repository.ClienteRepository;
import br.com.fiap.startup.repository.PrestadorRepository;
import br.com.fiap.startup.repository.ServicoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class DataGenerator {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ServicoRepository servicoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;


    @Autowired
    PrestadorRepository prestadorRepository;

    @Test
    public void insertRegistroCliente(){

        clienteRepository.save(
                new Cliente(1, "tipo", "usuario", "senha", new Dados(), "nomeCliente", new Date())
        );
        System.out.println(clienteRepository.findAll());

    }

    @Test
    public void insertRegistroServico(){

        servicoRepository.save(
        new Servico(1, "serviçosNome", 10.0, new PrestadorDeServico(2), new Categoria(1))
        );
        System.out.println(servicoRepository.findAll());

    }

    @Test
    public void insertRegistroCategoria(){

        categoriaRepository.save(
                new Categoria(1, "Categoria nome")
        );
        System.out.println(categoriaRepository.findAll());


    }

    @Test
    public void insertRegistroPrestador(){

//        prestadorRepository.save(
//                new PrestadorDeServico(2, "Tipo", "UsuarioPrestador", "senha", new Dados(),
//                "Fulano O tal")
//        );
        System.out.println(prestadorRepository.findAll());


    }
}
