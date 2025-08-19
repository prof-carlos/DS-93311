package org.example.ex2;

public class Veiculo {
    private String placa;
    private String cor;
    private String numeroPassageiros;
    private String capacidadeTanque;
    private String velocidadeMaxima;
    private String consumoMedio;

    public Veiculo(String placa, String cor, String numeroPassageiros, String capacidadeTanque, String velocidadeMaxima, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(String numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(String capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(String velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeroPassageiros='" + numeroPassageiros + '\'' +
                ", capacidadeTanque='" + capacidadeTanque + '\'' +
                ", velocidadeMaxima='" + velocidadeMaxima + '\'' +
                ", consumoMedio='" + consumoMedio + '\'' +
                '}';
    }
}
