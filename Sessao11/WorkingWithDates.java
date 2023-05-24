package Sessao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkingWithDates{
    public static void main(String[] args) {
        LocalDate dataLocal = LocalDate.now();
        LocalDateTime dataLocalComHora = LocalDateTime.now();
        Instant dataHoraGlobalGMT = Instant.now();

        System.out.println("Data Local " + dataLocal);
        System.out.println("Data Local com hora " + dataLocalComHora);
        System.out.println("Data Global GMT " + dataHoraGlobalGMT);
    }
}