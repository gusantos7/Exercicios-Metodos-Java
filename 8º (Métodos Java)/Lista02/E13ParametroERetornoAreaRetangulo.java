package Lista02;

public class E13ParametroERetornoAreaRetangulo {

    static float CalcularAreaRetangulo(float raio){
        return (float) (Math.PI * (Math.pow(raio, 2)));
    }

    public static void main(String[] args){
        float raio = 5f;
        System.out.println("A área do circulo de " + raio + " de raio é: " + String.format("%.2f",CalcularAreaRetangulo(raio)));
    }
}
