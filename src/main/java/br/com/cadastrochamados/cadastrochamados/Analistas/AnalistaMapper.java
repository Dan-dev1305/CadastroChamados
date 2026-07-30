package br.com.cadastrochamados.cadastrochamados.Analistas;

import org.springframework.stereotype.Component;

@Component
public class AnalistaMapper {

    public AnalistaModel map(AnalistaDTO analistaDTO){
        AnalistaModel analistaModel = new AnalistaModel();
        analistaModel.setId(analistaDTO.getId());
        analistaModel.setNome(analistaDTO.getNome());
        analistaModel.setEmail(analistaDTO.getEmail());
        analistaModel.setSenioridade(analistaDTO.getSenioridade());
        analistaModel.setChamados(analistaDTO.getChamados());
        return analistaModel;
    }

    public AnalistaDTO map(AnalistaModel analistaModel){
        AnalistaDTO analistaDTO = new AnalistaDTO();
        analistaDTO.setId(analistaModel.getId());
        analistaDTO.setNome(analistaModel.getNome());
        analistaDTO.setEmail(analistaModel.getEmail());
        analistaDTO.setSenioridade(analistaModel.getSenioridade());
        analistaDTO.setChamados(analistaModel.getChamados());
        return analistaDTO;
    }

}
