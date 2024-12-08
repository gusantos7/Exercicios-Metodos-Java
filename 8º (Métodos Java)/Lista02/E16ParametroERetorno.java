package Lista02;

public class E16ParametroERetorno {

    static boolean EhPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int numero = 4;
        System.out.println("O numero " + numero +
                ((EhPrimo(numero) == true ? " É PRIMO" : " NÃO É PRIMO")
                ));
    }
}
