package Day7;

public class Exception7 {
    public static void main(String[] args) {
              int balance = 5000;
              int withdrawl = 2000;

              try {
                  if (withdrawl > balance) {
                      throw new IllegalArgumentException(
                              "Insyfficient balance"
                      );
                  }
                  balance -= withdrawl;
                  System.out.println("Withdrawl was successful");
                  System.out.println("remaining balance is "+ " "+ balance);
              }catch (IllegalArgumentException e ){
                  System.out.println(e.getMessage());
              }
              finally {
                  System.out.println("Bank Application Terminated");
              }
    }
}
