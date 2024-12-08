package Lista02;

public class E12ParametroSemRetornoQuadradoDoNumero {

    static int ImprimirQuadrado(int numero){
        return (int) Math.pow(numero, 2);
    }

    public static void main(String[] args){
        int numero = 12;
        System.out.println("O quadrado de " + numero + " é: " + ImprimirQuadrado(numero));
    }
}
