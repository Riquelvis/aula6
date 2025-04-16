package br.unitins.locadora.filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository filmeRepository;

    List<Filme> getFilmes(){ // <-- Método adaptado
        // É necessário fazer o cast pois CrudRepository.findAll() retorna Iterable
        return (List<Filme>) filmeRepository.findAll(); // <-- Adaptado para Filme
    }

    Filme criarFilme(Filme filme){
        return filmeRepository.save(filme);
    }
}
