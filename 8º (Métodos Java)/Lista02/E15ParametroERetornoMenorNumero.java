package Lista02;

public class E15ParametroERetornoMenorNumero {

    static int ObterMenorNumero(int numero1, int numero2, int numero3) {
        return Math.min(Math.min(numero1, numero2), numero3);

        //Math.min compara os dois números passados e mostra o menor
        //Nesse caso, estou usando um Math.min comparando (numero1, numero2) e outro Math.Min comparando o menor entre
        //(numero1 e numero2) com numero3.
        //
        //Math.min(numero1, numero2)
        //Math.min((menor entre n1 e n2), numero3)
    }

    public static void main(String[] args) {
        int numero1 = 2312;
        int numero2 = 155;
        int numero3 = 213;

        System.out.println("O maior número entre: " + numero1 + ", " + numero2 + " e " + numero3
                + " é: " + ObterMenorNumero(numero1, numero2, numero3));
    }
}
