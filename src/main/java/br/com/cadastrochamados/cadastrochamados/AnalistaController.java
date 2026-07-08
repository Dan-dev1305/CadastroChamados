package br.com.cadastrochamados.cadastrochamados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AnalistaController {

    @GetMapping("/primeiraMsg")
    public String menssagemInicial(){
        return "Esta é o primeiro comando nessa rota";
    }
}
