package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalistasService {
    private AnalistaRepository analistaRepository;
    private AnalistaMapper analistaMapper;


    public AnalistasService(AnalistaRepository analistaRepository, AnalistaMapper analistaMapper) {
        this.analistaRepository = analistaRepository;
        this.analistaMapper = analistaMapper;

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

    //Criar um novo analista
    public AnalistaDTO criarAnalista(AnalistaDTO analistaDTO){
        AnalistaModel analista = analistaMapper.map(analistaDTO);
        analista = analistaRepository.save(analista);
        return analistaMapper.map(analista);

    }

    //Atualizar analista
    public AnalistaModel atualizarAnalista(Long id, AnalistaModel analistaAtualizado){
        if (analistaRepository.existsById(id)){
            analistaAtualizado.setId(id);
            return analistaRepository.save(analistaAtualizado);
        }
        return null;
    }

    //Deletar um analista - tem que ser void
    public void deletarAnalistaPorId(Long id){
         analistaRepository.deleteById(id);
    }
}
