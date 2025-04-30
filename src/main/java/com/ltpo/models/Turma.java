package com.ltpo.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    public Turma (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public Turma(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
