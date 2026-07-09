package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AnalistaController {

    @GetMapping("/analistaMsg")
    public String menssagemInicial(){
        return "Resposta Analista";
    }
}
