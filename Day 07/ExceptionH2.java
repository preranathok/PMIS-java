package Day7;

public class ExceptionH2 {
    public static void main(String[] args) {
        int a =10;
        int b = 0;
        try{
            int res =a/b;
            System.out.println(res);
            int[] ar = {10,20,30};
            System.out.println(ar[5]);


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("give valid array input");

        }catch (ArithmeticException e1){
            System.out.println("Give valid input to divide");
        }
    }
}
