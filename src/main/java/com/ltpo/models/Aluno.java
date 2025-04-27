package com.ltpo.models;

import jakarta.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Aluno(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public Aluno(){}

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Turma getTurma() {
        return turma;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
