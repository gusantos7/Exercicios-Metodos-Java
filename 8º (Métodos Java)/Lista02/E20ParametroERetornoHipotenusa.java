package Lista02;

public class E20ParametroERetornoHipotenusa {

    static float CalcularHipotenusa(float lado1, float lado2){
        return (float) Math.sqrt(Math.pow(lado1, 2f) + Math.pow(lado2, 2f));
    }

    public static void main(String[] args){
        float cateto1 = 3f;
        float cateto2 = 4f;

        System.out.println("A hipotenusa desse triângulo Retângulo é: " +
                String.format("%.2f", CalcularHipotenusa(cateto1, cateto2)));
    }
}
