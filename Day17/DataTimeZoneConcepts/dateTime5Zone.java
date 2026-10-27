    /*LocalDate
        - LocalTime
        - LocalDateTime
       **-ZonedDateTime
        - DateTimeFormatter
        */

import java.time.*;
import java.util.Set;

public class dateTime5Zone {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        //System.out.println(now);
        Set<String> availableZones = ZoneId.getAvailableZoneIds();
        availableZones.forEach(System.out::println);
    }
}
