package Lista01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class E07SemParametroERetornoDataAtual {

    public static String ObterDataAtual(){
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter fomatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataAtual.format(fomatacao);
    }

    public static void main(String[] args){
        System.out.println("Data de hoje: " + ObterDataAtual());
    }
}
