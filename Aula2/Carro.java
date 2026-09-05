package Aula2;

public class Carro{
    String marca;
    String cor;
    String modelo;
    int velocidade;

    void acelerar(){
    velocidade = velocidade + 10;
}
void frear(){
    velocidade = velocidade - 10;
}

void mostrarDados(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: "+ modelo);
    System.out.println("Cor: " + cor);
    System.out.println("Velocidade: " + velocidade);
    System.out.println();
}

}