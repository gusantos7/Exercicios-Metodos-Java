package Lista02;

public class E14ParametroERetornoPerimetroCirculo {

    static float CalcularAreaRetangulo(float raio) {
        return (float) ((float) 2 * Math.PI * raio);
    }

    public static void main(String[] args) {
        float raio = 5f;
        System.out.println("O perimetro de um circulo de raio " + raio + " é: " +
                String.format("%.2f", CalcularAreaRetangulo(raio)));
        System.out.println(
                "Este é um exemplo de código que ultrapassa o limite da linha de código configurado no IntelliJ IDEA, e precisa ser quebrado automaticamente.");

    }
}
