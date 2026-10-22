
// Consumer 
import java.util.function.*;
public class lambda4 {
    public static void main(String[] args){
        Consumer<String> smsNotifier =  mobno -> {
        System.out.println("Sending the OTP to the ph no:"  + mobno);
        };
        smsNotifier.accept(" +91 1234567891 ");
    }
    }

    