import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        // Local Date
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2025,2,23);

        System.out.println("today : "+today);
        System.out.println("yesterday : "+yesterday);

        // Local Time
        // LocalDateTime
        // ZonedDateTime
        ZonedDateTime hawaii = ZonedDateTime.now(ZoneId.of("US/Hawaii"));
        System.out.println("Hawaii : "+hawaii);

        LocalDate _100DaysAfter = today.minusDays(100);
        System.out.println("_100DaysAfter : "+_100DaysAfter);
    }
}
