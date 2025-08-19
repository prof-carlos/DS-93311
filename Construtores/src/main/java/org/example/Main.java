package org.example;

public class Main {
    public static void main(String[] args) {
        // Instanciar uma classe.
        Cliente c1 = new Cliente("Marta", 25);

        // Atribuir valores utilizando métodos de acesso.
        c1.setNome("José");
        c1.setIdade(50);

        // Mostrar valores.
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
    }
}