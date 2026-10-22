package Day7;


import java.util.Scanner;

public class ExceptionH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age < 0){
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
        }
        System.out.println("Age" + " "+age);
    }
}
