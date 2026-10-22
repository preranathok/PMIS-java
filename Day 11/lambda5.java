import java.util.function.*;
import java.util.Random;
// Mobile otp random genmeration
 class lambda5 {
    public static void main(String[] args){
Supplier<String> otpgen = () -> {
    Random random = new Random();
    int number = 100000 + random.nextInt(9000000);
    return String.valueOf(number);

};
String userotp = otpgen.get();
System.out.println("The OTP is: "+ userotp);

}
    }

