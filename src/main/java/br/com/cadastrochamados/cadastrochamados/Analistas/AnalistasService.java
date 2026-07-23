package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Listar os analistas por Id
    public AnalistaModel listarAnalistasPorId(long id){
        Optional<AnalistaModel> analistaModel = analistaRepository.findById(id);
        return analistaModel.orElse(null);
    }
}
