package Lista01;

public class E09ParametroERetornoConcatenarString {

    static String ConcatenarString(String texto1, String texto2){
        return "Exemplo de adjetivos são: " + texto1 + " e " + texto2;
    }

    public static void main(String[] args){
        System.out.println(ConcatenarString("Bonito", "Bondoso"));
    }
}
