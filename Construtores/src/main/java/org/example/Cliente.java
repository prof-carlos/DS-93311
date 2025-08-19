package org.example;

public class Cliente {
    // Atributos da classe.
    private String nome;
    private int idade;

    // Construtor.
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos da classe
    // Métodos de acesso.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
