package br.com.cadastrochamados.cadastrochamados.Chamados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ChamadoController {

    @GetMapping("/chamadoMsg")
    public String menssagemInicial(){
        return "Resposta chamado";
    }

}
