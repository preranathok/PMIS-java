package Day7;




import java.util.Scanner;
    class Divide {
        int a, b, c;

        public void divide() throws InterruptedException{
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter numertor");
                a = sc.nextInt();
                System.out.println("Enter denominator");
                b = sc.nextInt();
                c = a / b;
                Thread.sleep(5000);
                System.out.println(c);
            } catch (Exception e) {
                System.out.println("Enter valid input");
                throw e;

            }
            finally {
                System.out.println("app terminated ");
            }
        }
    }
    public class ExceptionExtra {
        public static void main(String[] args) {
            try {

                Divide d = new Divide();
                d.divide();
            } catch (Exception e) {
                System.out.println("handle by yourself");

            }
            System.out.println("terminated");
        }
    }
