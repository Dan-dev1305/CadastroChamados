package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalistasService {
    private AnalistaRepository analistaRepository;

    public AnalistasService(AnalistaRepository analistaRepository) {
        this.analistaRepository = analistaRepository;
    }

    //Listar os analistas
    public List<AnalistaModel> listarAnalistas(){
        return analistaRepository.findAll();
    }
}
