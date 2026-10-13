package Day7;

public class ExceptionH3 {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        try{
            int res  =a/b;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Invalid Program");
        }
        finally {
            System.out.println("Application closed");
        }
    }
}
