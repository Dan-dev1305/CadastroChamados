package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AnalistaController {

    @GetMapping("/analistaMsg")
    public String menssagemInicial(){
        return "Resposta Analista";
    }

    // Adicionar Analista (Create)
    @PostMapping ("/criar")
    public String criarAnalista(){
        return "Analista criado";
    }

    // Mostrar todos os analistas (REad)
    @GetMapping ("/todos")
    public String mostrarTodosAnalistas(){
        return "Mostrar todos os analistas";
    }

    // Mostrar todos os analistas por ID (REad)
    @GetMapping ("/todosId")
    public String mostrarTodosAnalistasPorId(){
        return "Mostrar todos os analistas";
    }

    //Alterar dados dos analistas (Update)
    @PutMapping ("/alterarId")
    public String alterarAnalistasPorId(){
        return "Analista alterado";
    }

    //Deletar Analistas (Delete)
    @DeleteMapping ("/deletarId")
    public String deletarAnalistaPorId(){
        return "Analista deletado";
    }
}
