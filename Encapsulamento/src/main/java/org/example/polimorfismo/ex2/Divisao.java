package org.example.polimorfismo.ex2;

public class Divisao implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        return a / b;
    }
}
