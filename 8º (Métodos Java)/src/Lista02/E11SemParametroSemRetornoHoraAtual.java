package Lista02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class E11SemParametroSemRetornoHoraAtual {

    public static String ExibirHoraAtual() {
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        return horaAtual.format(formatter);
    }

    public static void main(String[] args){
        System.out.println("Agora são " + ExibirHoraAtual()
                + "\n" + TempoSemProa() );
    }

    public static String TempoSemProa(){
        LocalDateTime momentoPassado = LocalDateTime.parse("2024-12-12 18:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        LocalDateTime horaAtual = LocalDateTime.now();

        Duration duracao = Duration.between(momentoPassado, horaAtual);

        long diasDecorridos = duracao.toDays();
        long horasDecorridas = duracao.toHours() % 24;
        long minutosDecorridos = duracao.toMinutes() % 60;

        return "Fazem " + diasDecorridos + " dias, " + horasDecorridas + " horas e " + minutosDecorridos + " minutos que estou sem Proa";
    }
}