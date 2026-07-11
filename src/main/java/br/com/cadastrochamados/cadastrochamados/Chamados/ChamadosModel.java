package br.com.cadastrochamados.cadastrochamados.Chamados;

import br.com.cadastrochamados.cadastrochamados.Analistas.AnalistaModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
@Table (name = "tb_chamados")
public class ChamadosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_equipamento")
    private int numeroEquipamento;

    @Column(name = "responsavel_chamado")
    private String responsavelChamado;

    @Column(name = "dificuldade_chamado")
    private String dificuldadeChamado;

    @OneToMany (mappedBy = "chamados")
    private List<AnalistaModel> analistas;}

//    public ChamadosModel() {
//    }
//
//    public ChamadosModel(int numeroEquipamento, String responsaveChamado, String dificuldadeChamado) {
//        this.numeroEquipamento = numeroEquipamento;
//        this.responsaveChamado = responsaveChamado;
//        this.dificuldadeChamado = dificuldadeChamado;
//    }
//
//    public int getNumeroEquipamento() {
//        return numeroEquipamento;
//    }
//
//    public void setNumeroEquipamento(int numeroEquipamento) {
//        this.numeroEquipamento = numeroEquipamento;
//    }
//
//    public String getResponsaveChamado() {
//        return responsaveChamado;
//    }
//
//    public void setResponsaveChamado(String responsaveChamado) {
//        this.responsaveChamado = responsaveChamado;
//    }
//
//    public String getDificuldadeChamado() {
//        return dificuldadeChamado;
//    }
//
//    public void setDificuldadeChamado(String dificuldadeChamado) {
//        this.dificuldadeChamado = dificuldadeChamado;
//    }
//}
