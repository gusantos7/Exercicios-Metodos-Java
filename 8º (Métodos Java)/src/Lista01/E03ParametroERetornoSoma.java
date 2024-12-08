package Lista01;

public class E03ParametroERetornoSoma {

    //primeira maneira
    static int Somar(int numero1, int numero2){
        return numero1 + numero2;
    }

    //segunda maneira
    static int Somar2(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static void main(String[] args){
        //primeira maneira
        System.out.println(Somar(2, 10));

        //segunda maneira
        int soma = Somar2(10, 20);
        System.out.println(soma);
    }
}
