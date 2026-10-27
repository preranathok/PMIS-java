// if we mentioned a input of the particular Zone then output should come in time of that particular zone



import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;

class dateTimeZone2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time zone (e.g., Asia/Tokyo): ");
        String zoneInput = sc.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneInput);

            ZonedDateTime currentTime = ZonedDateTime.now(zone);

            System.out.println("Time zone: " + zone);
            System.out.println("Current date and time: " + currentTime);

        } catch (java.time.DateTimeException e) {
            System.out.println("Invalid time zone! Please enter a valid zone ID.");
        }

        sc.close();
    }
}
