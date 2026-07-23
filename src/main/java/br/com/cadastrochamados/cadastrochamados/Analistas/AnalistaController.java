package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analistas")
public class AnalistaController {
    private final AnalistasService analistasService;
    private AnalistaRepository analistaRepository;

    public AnalistaController(AnalistaRepository analistaRepository, AnalistasService analistasService) {
        this.analistaRepository = analistaRepository;
        this.analistasService = analistasService;
    }

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
    public List<AnalistaModel> mostrarTodosAnalistas(){
        return analistasService.listarAnalistas();
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
