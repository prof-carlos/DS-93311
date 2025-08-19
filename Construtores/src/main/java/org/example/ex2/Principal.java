package org.example.ex2;

public class Principal {
    public static void main(String[] args) {
    // Instanciando classes.
        Veiculo veiculo1 = new Veiculo("6135xv", "Prata", "5", "80", "200", "15");
        Livro livro1 = new Livro("A Cabana", "Arthur Kivel", "452154DB", "250","45");

        // Exibindo dados.
        System.out.println(veiculo1.toString());
        System.out.println(livro1.toString());
    }
}
