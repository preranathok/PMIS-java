package Day5;

class Electronics {
    void powerOn() {
        System.out.println("Welcome !!!");
    }
}
   class  cellPhone extends Electronics{
            void makeCall(){
                System.out.println("Calling the Number");
            }

   }

   class smartPhone extends cellPhone{
            void broweInternet(){
                System.out.println("Opening Browser");
            }
   }


public class multiInherit {

    public static void main(String[] args) {
                smartPhone s1 = new smartPhone();
                s1.powerOn();
                s1.makeCall();
                s1.broweInternet();
    }
}
