package Lista01;

public class E10ParametroERetornoMedia {

    public static void main(String[] args){
        System.out.println("A média das suas notas é: " + String.format("%.1f", CalcularMedia(10.3f, 5.3f, 7.5f)));
    }

    static float CalcularMedia(float numero1, float numero2, float numero3){
        return (numero1 + numero2 + numero3) / 3;
    }
}
