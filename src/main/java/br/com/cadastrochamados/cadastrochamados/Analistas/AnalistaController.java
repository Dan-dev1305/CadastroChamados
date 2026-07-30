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
    public AnalistaDTO criarAnalista(@RequestBody AnalistaDTO analista){
        return analistasService.criarAnalista(analista);
    }

    // Mostrar todos os analistas (REad)
    @GetMapping ("/todos")
    public List<AnalistaModel> mostrarTodosAnalistas(){
        return analistasService.listarAnalistas();
    }

    // Mostrar todos os analistas por ID (REad)
    @GetMapping ("/todos/{id}")
    public AnalistaModel listarAnalistasPorId(@PathVariable long id){
        return analistasService.listarAnalistasPorId(id);
    }

    //Alterar dados dos analistas (Update)
    @PutMapping ("/alterarId/{id}")
    public AnalistaModel alterarAnalistasPorId(@PathVariable Long id, @RequestBody AnalistaModel analistaAtualizado){
        return analistasService.atualizarAnalista(id, analistaAtualizado);
    }

    //Deletar Analistas (Delete)
    @DeleteMapping ("/deletar/{id}")
    public void deletarAnalistaPorId(@PathVariable Long id){
        analistasService.deletarAnalistaPorId(id);
    }
}
