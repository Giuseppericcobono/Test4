import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.DayOfWeek;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testGetYear() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = dateTime.getYear();
        assertEquals(2023, year, "Anno errato");
    }

    @Test
    public void testGetMonth() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int month = dateTime.getMonthValue();
        assertEquals(3, month, "Mese errato");
    }

    @Test
    public void testGetDay() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int day = dateTime.getDayOfMonth();
        assertEquals(1, day, "Giorno errato");
    }

    @Test
    public void testGetDayOfWeek() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        assertEquals(DayOfWeek.WEDNESDAY, dayOfWeek, "Giorno della settimana errato");
    }
}