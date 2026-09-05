package Exe_Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.err.println(
                "___________________________________________________________________Inicio de codigo______________________________________________________________________");
        Carrinho CarroFiat = new Carrinho("Fiat", "Preto", "Uno", 1993, "Hibrido");

        System.out.println("Estado Inicial: ");
        CarroFiat.mostrarDados();

        System.out.println("Acelerando...");
        CarroFiat.acelerar();
        CarroFiat.ligar();
        CarroFiat.acelerar();
        CarroFiat.acelerar();

        CarroFiat.mostrarDados();

        System.out.println("Freando ...");

        CarroFiat.frear();
        CarroFiat.frear();
        CarroFiat.frear();

        CarroFiat.desligado();
        CarroFiat.mostrarDados();
    }
}
