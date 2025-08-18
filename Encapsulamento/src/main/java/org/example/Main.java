package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciar a classe.
        Cliente c1 = new Cliente();
        Produto p1 = new Produto();

        // Atribuindo valores.
        c1.setNome("Marta");
        c1.setIdade(25);
        p1.setNome("Notebook");
        p1.setPrecoUnitario(4000);

        // Exibindo dados.
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("\nNome do produto: " + p1.getNome());
        System.out.println("Preço unitário: " + p1.getPrecoUnitario());
    }
}