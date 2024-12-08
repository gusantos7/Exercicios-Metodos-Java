package Lista02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class E17SemParametroERetornoNumeroAleatorio {

    static int GerarNumeroAleatorio(){

        /*
        Random random = new Random();
        return random.nextInt(100) + 1;
        */

        return (int) (Math.random() * 100) + 1;

      //return ThreadLocalRandom.current().nextInt(1, 101);
    }

    public static void main(String[] args){
        System.out.println("Número aleatório entre 1 e 100:\n" +
                GerarNumeroAleatorio());
    }
}
