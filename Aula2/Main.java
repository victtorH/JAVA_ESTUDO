package Aula2;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Vermelho";
        carro1.ano = 1992;
        carro1.combustivel = "gasolina";
        carro1.velocidade = 0;

        System.out.println("Estado Inicial: ");
        carro1.mostrarDados();

        System.out.println("Acelerando...");
        carro1.acelerar();
        carro1.ligar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.mostrarDados();

        System.out.println("Freando ...");

        carro1.frear();
        carro1.frear();
        carro1.frear();

        carro1.desligado();
        carro1.mostrarDados();
    }
}