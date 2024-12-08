package Lista02;

public class E19ParametroERetornoInverterString {

    static String InvertereString(String texto) {

        if (texto.isEmpty()){
            return texto;
        }

        //Utilizando StringBuilder
        //return new StringBuilder(texto).reverse().toString();

        //Utilizando Laço For

        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido;

        //Utilizando InverterString
        //return InvertereString(texto.substring(1)) + texto.charAt(0);

    }

    public static void main(String[] args) {
        String texto = "!!ahcraM ,CB ues aroB";
        System.out.println("Texto Original: " + texto
                + "\nTexto Invertido: " + InvertereString(texto));
    }

}
