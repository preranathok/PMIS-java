/*- LocalDate
        -LocaLTime
        -LocalDateTime
    -ZonedDateTime
     -DateTimeFormatter.
        */
import java.time.LocalDate;
class DataTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("Today: " + now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Yesterday was: " + yesterday);
        LocalDate pastDate = now.minusMonths(100);
        System.out.println("100 months before was: " + pastDate);
    }
}
