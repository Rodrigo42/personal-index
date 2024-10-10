package br.com.fiap.repository;

import br.com.fiap.model.JogosModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JogosRepository extends MongoRepository <JogosModel, String> {

}
