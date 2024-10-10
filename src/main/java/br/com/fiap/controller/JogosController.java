package br.com.fiap.controller;

import br.com.fiap.model.JogosModel;
import br.com.fiap.service.JogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//String titulo, String desenvolvedora, String midia, Integer lancamento, Boolean terminado, Boolean platinado, String plataforma
    @PostMapping("/inserir")
    public JogosModel inserirJogo(@RequestBody JogosModel jogo){
        return jogosService.gravar(jogo);
    }
}
