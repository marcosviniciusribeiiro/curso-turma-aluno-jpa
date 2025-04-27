package com.ltpo.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Turma> turmas = new ArrayList<>();
    public Curso (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
    public Curso (){}

    public Long getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
