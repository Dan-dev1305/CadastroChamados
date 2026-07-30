package br.com.cadastrochamados.cadastrochamados.Analistas;

import br.com.cadastrochamados.cadastrochamados.Chamados.ChamadosModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AnalistaDTO {

    private Long id;
    private String nome;
    private String email;
    private String senioridade;
    private String especialidade;
    private ChamadosModel chamados;




}
