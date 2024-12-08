package Lista01;

import org.w3c.dom.ls.LSOutput;

public class E06ParametroERetornoParOuImpar {

    static String EhPar(int numero){
        if ((numero % 2) == 0 ){
            return "par";
        } else {
            return "impar";
        }

    }

    public static void main(String[] args){
        System.out.println("Número 20 é " + EhPar(20));
        System.out.println("Número 21 é " + EhPar(21));
    }
}
