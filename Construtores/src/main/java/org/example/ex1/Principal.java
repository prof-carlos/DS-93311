package org.example.ex1;

public class Principal {
    public static void main(String[] args) {

        // Instanciar a classe Pet.
        Pet p1 = new Pet("Totó", 4, "Vira-lata", "Médio", "Ração");
        Pet p2 = new Pet("Lobo", 5, "Pastor Alemão", "Médio", "Ração");

        // Mostrando os valores.
        System.out.println(p1);
        System.out.println(p2.toString());
    }
}
