package Lista01;

public class E08ParametroERetornoFatorial {

    static int CalcularFatorial(int numero){
        int resultado = 1;

        for (int i = 1; i <= numero; i++){
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args){
        System.out.println("O fatorial de 5 é " + CalcularFatorial(5));
    }
}
