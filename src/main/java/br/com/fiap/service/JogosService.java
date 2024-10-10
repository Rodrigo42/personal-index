package br.com.fiap.service;

import br.com.fiap.model.JogosModel;
import br.com.fiap.repository.JogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosService {

    @Autowired
    private JogosRepository jogosRepository;

    public JogosModel gravar(JogosModel jogosModel){

        return jogosRepository.save(jogosModel);
    }


    public List<JogosModel> buscarTodos(){
        return  jogosRepository.findAll();
    }

    public JogosModel deletarJogo(String jogoNome){

        JogosModel jogosModel = null;
        return jogosModel;
    }
    public JogosModel alterarJogo(String jogoNome){

        JogosModel jogosModel = null;
        return jogosModel;
    }

}
