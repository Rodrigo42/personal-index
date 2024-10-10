package br.com.fiap.controller;

import br.com.fiap.model.JogosModel;
import br.com.fiap.service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogosService jogosService;

    @GetMapping("/todos")
    public List<JogosModel> listarTodosJogos(){
        return jogosService.buscarTodos();
    }
}
