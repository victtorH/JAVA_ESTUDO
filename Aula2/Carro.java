package Aula2;

public class Carro {

    String marca;
    String cor;
    String modelo;
    int velocidade;
    int ano;
    String combustivel;
    boolean ligado;

    void acelerar() {
        if (ligado) {
            velocidade = velocidade + 10;
            System.out.println("O carro aumentou a velocidade para: " + velocidade);
            return;

        }
        ;
        System.out.println("O Carro não pode aumentar a velocidade sem estar ligado");
    }

    void frear() {
        if (ligado && velocidade >= 10) {
            velocidade = velocidade - 10;
            System.out.println("O carro diminuiu a velocidade para: " + velocidade);
            return;
        } else if (ligado) {
            System.out.println("O carro está parado");
            return;
        }
        ;
        System.out.println("O Carro não pode aumentar a velocidade sem estar ligado");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Ano: " + ano);
        System.out.println("Combustivel: " + combustivel);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }

    void ligar() {
        ligado = true;   System.out.println("Carro ligado");
    }

    void desligado() {
        ligado = false;   System.out.println("Carro desligado");
    }

    void buzinar() {

        if (ligado) {
            System.out.println("BiBiii");
            System.out.println("O carro buzinou");
            return;
        }
        System.out.println("O carro não pode buzinar pois está desligado");
    }

}