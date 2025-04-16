package br.unitins.locadora.filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    FilmeService filmeService;

    @GetMapping
    List<Filme> pegarFilmes(){
        return filmeService.getFilmes();
    }
    @PostMapping
    Filme salvarFilme(@RequestBody Filme filme){ // <-- Método e parâmetro adaptados
        return filmeService.criarFilme(filme); // <-- Chama o serviço adaptado
    }
}