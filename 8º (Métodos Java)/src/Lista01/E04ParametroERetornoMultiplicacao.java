package Lista01;

public class E04ParametroERetornoMultiplicacao {
    //primeira maneira
    static int Multiplica(int numero1, int numero2){
        return numero1 * numero2;
    }

    //segunda maneira
    static int Multiplica2(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static void main(String[] args){
        //primeira maneira
        System.out.println(Multiplica(2, 10));

        //segunda maneira
        int resultado = Multiplica2(10, 20);
        System.out.println(resultado);
    }
}