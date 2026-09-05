package Exe_Encapsulamento;

public class Carrinho {
    private String Marca;
    private String Cor;
    private String Modelo;
    private int Velocidade;
    private int Ano;
    private String Combustivel;
    private boolean Ligado;

    public Carrinho(String marca, String cor, String modelo, int ano, String combustivel) {
        Marca = marca;
        Cor = cor;
        Modelo = modelo;
        Ano = ano;
        Velocidade = 0;
        Combustivel = combustivel;
        Ligado = false;

    }

    void acelerar() {
        if (Ligado) {
            Velocidade = Velocidade + 10;
            System.out.println("O carro aumentou a velocidade para: " + Velocidade);
            return;

        }
        ;
        System.out.println("O Carro não pode aumentar a velocidade sem estar ligado");
    }

    void frear() {
        if (Ligado && Velocidade >= 10) {
            Velocidade = Velocidade - 10;
            System.out.println("O carro diminuiu a velocidade para: " + Velocidade);
            return;
        } else if (Ligado) {
            System.out.println("O carro está parado");
            return;
        }
        ;
        System.out.println("O Carro não pode aumentar a velocidade sem estar ligado");
    }

    void mostrarDados() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Cor: " + Cor);
        System.out.println("Velocidade: " + Velocidade);
        System.out.println("Ano: " + Ano);
        System.out.println("Combustivel: " + Combustivel);
        System.out.println("Ligado: " + Ligado);
        System.out.println();
    }

    void ligar() {
        Ligado = true;
        System.out.println("Carro ligado");
    }

    void desligado() {
        Ligado = false;
        System.out.println("Carro desligado");
    }

    void buzinar() {

        if (Ligado) {
            System.out.println("BiBiii");
            System.out.println("O carro buzinou");
            return;
        }
        System.out.println("O carro não pode buzinar pois está desligado");
    }

}
