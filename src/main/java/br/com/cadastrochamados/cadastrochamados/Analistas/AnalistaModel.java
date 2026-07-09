package br.com.cadastrochamados.cadastrochamados.Analistas;

import br.com.cadastrochamados.cadastrochamados.Chamados.ChamadosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class AnalistaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senioridade;
    @ManyToOne
    @JoinColumn(name = "chamados_id")
    private ChamadosModel chamados;

    public AnalistaModel() {
    }

    public AnalistaModel(String nome, String email, String senioridade) {
        this.nome = nome;
        this.email = email;
        this.senioridade = senioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }


}
