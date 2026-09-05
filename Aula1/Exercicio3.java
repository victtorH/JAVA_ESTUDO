public class Exercicio3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int auxiliar;
        auxiliar = a; 
        a = b;        
        b = auxiliar;
        System.out.println("Valor de A depois da troca: " + a);
        System.out.println("Valor de B depois da troca: " + b); 
    }
}