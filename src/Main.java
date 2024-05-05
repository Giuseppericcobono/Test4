//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
//Crea dei test per questo esercizio

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        Integer anno = getYear(data);
        System.out.println("Anno: " + anno);

        Month mese = getMonth(data);
        System.out.println("Mese: " + mese);

        Integer giorno = getDayOfMonth(data);
        System.out.println("Giorno: " + giorno);

        DayOfWeek giornoSettimana = getDataDayOfWeek(data);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }

    private static DayOfWeek getDataDayOfWeek(OffsetDateTime data) {
        return data.getDayOfWeek();
    }

    private static int getDayOfMonth(OffsetDateTime data) {
        return data.getDayOfMonth();
    }

    private static Month getMonth(OffsetDateTime data) {
        return data.getMonth();
    }

    private static int getYear(OffsetDateTime data) {
        return data.getYear();
    }
}