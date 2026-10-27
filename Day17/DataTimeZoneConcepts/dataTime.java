// FineTeck
// Banking
// Multi region Saas appllications.
// Spring Boot & Hibernet / JPA Entities
// Fligh
/*
- Local Date
-Local Time

 */

import java.time.LocalDate;

class dataTime {
    public static void main(String[] args) {

        LocalDate customDate = LocalDate.of(2026, 12, 31);
        System.out.println(customDate);

        LocalDate now = LocalDate.now();

        int dayOfMonth = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();

        System.out.println("Day: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}
