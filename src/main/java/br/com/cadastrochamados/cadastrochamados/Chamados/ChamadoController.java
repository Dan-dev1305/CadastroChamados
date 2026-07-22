package br.com.cadastrochamados.cadastrochamados.Chamados;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("chamados")
public class ChamadoController {

    @GetMapping("/chamadoMsg")
    public String menssagemInicial(){
        return "Resposta chamado";
    }

    @GetMapping("/listar")
    public String listarChamados(){
        return "Chamados listados";
    }

    @PostMapping("/criar")
    public String criarChamado(){
        return "Chamado criado";
    }

    @PutMapping("/alterar")
    public String alterarChamadoPorId(){
        return "Chamado alterado";
    }

    @DeleteMapping("/deletar")
    public String deletarChamadoPorId(){
        return "Chamado deletado";
    }

}
