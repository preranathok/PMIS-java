import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MeetingTimeAssistant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");
        System.out.println("=======MEETING TIME ASSISTANT ====");
        System.out.println("ENTER MEETING DATE(yyyy-mm-dd):");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.println("Enter meeting time(HH:mm):");
        System.out.println("Enter meeting duration in minutes:");
        int duration = sc.nextInt();
        if(duration <=0) {
            System.out.println("Duration must be Greater than 0.");
            sc.close();
            return;
        }
        LocalTime time;
        LocalDateTime meetingStart;
        meetingStart = LocalDateTime.of(date, time);
        LocalDateTime meetingEnd = meetingStart.plusMinutes(duration);
        int choice;
        do{
            System.out.println("\nChoose an option:");
            System.out.println("1.Display meeting date and time");
            System.out.println("2.Display meeting end time");
            System.out.println("3. Display meeting time in another zone");
            System.out.println("4.Check Weather the meeting is in future");
            System.out.println("5.Exit");

            System.out.println("Enter choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Meeting date and time: " +meetingStart.format(formatter));
                    break;
                case 2:
                    System.out.println("Meeting starts at: " + meetingStart.format(formatter));
                    System.out.println("Meeting ends at: " + meetingEnd.format(formatter));
                    break;
                case 3:
                    System.out.print("Enter time zone(e.g., Asia/Tokoyo): ");
                    String zoneInput = sc.nextLine();
                    try {
                        ZoneId zone = ZoneId.of(zoneInput);

                        ZonedDateTime zonedStart =
                                meetingStart.atZone(ZoneId.systemDefault())
                                        .withZoneSameInstant(zone);

                        ZonedDateTime zonedEnd =
                                meetingEnd.atZone(ZoneId.systemDefault())
                                        .withZoneSameInstant(zone);

                        System.out.println("Meeting starts in " + zone + ": "
                                + zonedStart.format(formatter));
                        System.out.println("Meeting ends in " + zone + ":   "
                                + zonedEnd.format(formatter));

                    } catch (DateTimeException e) {
                        System.out.println(
                                "Invalid time zone! Please enter a valid zone ID.");
                    }
                    break;

                case 4:
                    if (meetingStart.isAfter(LocalDateTime.now())) {
                        System.out.println("The meeting is in the future.");
                    } else {
                        System.out.println(
                                "The meeting has already started or is in progress.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting MeetingTimeAssistant...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
    }
}



