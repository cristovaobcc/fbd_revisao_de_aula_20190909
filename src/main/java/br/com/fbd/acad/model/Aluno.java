/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fbd.acad.model;

/**
 * Classe que representa um aluno num sistema acadêmico.
 * @author cristovao
 */
public class Aluno {
    
    private String nome;
    private String cpf;
    private Integer id;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    
}
