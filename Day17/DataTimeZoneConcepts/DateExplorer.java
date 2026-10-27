/*Create a Java program called DateExplorer that asks the user to enter a date in the format yyyy-MM-dd. The program should then display a menu that allows the user to explore different details about that date.
        For example, the user enters 2026-10-26 and gets the following menu:
Requirements
1. Ask the user to input a date using Scanner.
2. Use LocalDate.parse() to convert the input into a LocalDate object.
        3. Use a switch statement to handle the menu options.
        4. Use minusMonths() to look back by a number of months specified by the user.
        5. Use getMonth(), getYear(), and getDayOfWeek() to display date information.
        6. Use an if-else statement to check whether the entered year is a leap year.
7. Use a loop to keep displaying the menu until the user chooses Exit.
8. Create a DateExplorer class with methods such as displayMonth(), displayYear(), and lookBackMonths().
*/


import java.util.Scanner;
import java.time.LocalDate;

public class DateExplorer {

        private LocalDate date;

        DateExplorer(LocalDate date) {
                this.date = date;
        }

        void displayMonth() {
                System.out.println("Month: " + date.getMonth());
        }

        void displayYear() {
                System.out.println("Year: " + date.getYear());
        }

        void displayDayOfWeek() {
                System.out.println("Day of the week: " + date.getDayOfWeek());
        }
        void lookBackMonths(int months) {
                if (months < 0) {
                        System.out.println("Please enter a positive number.");
                } else {
                        LocalDate pastDate = date.minusMonths(months);
                        System.out.println(months + " months before " + date + " is " + pastDate);}
        }
        void checkLeapYear() {
                if (date.isLeapYear()) {
                        System.out.println("It is a leap year.");
                } else {
                        System.out.println("It is not a leap year.");
                } }
                public static void main (String[]args){
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter the date (yyyy-MM-dd): ");
                        String input = sc.nextLine();
                        LocalDate userDate = LocalDate.parse(input);
                        DateExplorer explorer = new DateExplorer(userDate);
                        int choice;
                        do {
                                System.out.println("\n----- Date Explorer -----");
                                System.out.println("1. Display Month");
                                System.out.println("2. Display Year");
                                System.out.println("3. Display Day of Week");
                                System.out.println("4. Check Leap Year");
                                System.out.println("5. Look Back by Months");
                                System.out.println("6. Exit");
                                System.out.print("Enter your choice: ");
                                choice = sc.nextInt();
                                switch (choice) {
                                        case 1:
                                                explorer.displayMonth();
                                                break;
                                        case 2:
                                                explorer.displayYear();
                                                break;
                                        case 3:
                                                explorer.displayDayOfWeek();
                                                break;
                                        case 4:
                                                explorer.checkLeapYear();
                                                break;
                                        case 5:
                                                System.out.print("Enter number of months: ");
                                                int months = sc.nextInt();
                                                explorer.lookBackMonths(months);
                                                break;
                                        case 6:
                                                System.out.println("Exiting DateExplorer...");
                                                break;
                                        default:
                                                System.out.println("Invalid choice!");}
                        } while (choice != 6);
                        sc.close();
                } }
