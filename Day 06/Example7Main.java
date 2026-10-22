package Day6;

public class Example7Main{
    public static void main(String[] args) {


        System.out.println("Initial User Count: " + UserAccount.getTotalUsers());

        UserAccount u1 = new UserAccount("Aarav");
        UserAccount u2 = new UserAccount("Priya");
        UserAccount u3 = new UserAccount("Rohan");

        System.out.println("Username: " + u1.getUsername());
        System.out.println("Username: " + u2.getUsername());
        System.out.println("Username: " + u3.getUsername());

        System.out.println("Total Registered Users: " + UserAccount.getTotalUsers());
    }

}

