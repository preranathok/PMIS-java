
// using a library;
import java.time.LocalDateTime;
import java.time. LocalTime;

//class dataTime4 {
//    public static void main(String[] args) {
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
//    }
//}

import java.time.LocalTime;

class dataTime4 {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customTime = LocalTime.of(11, 32, 45);
        System.out.println(customTime);
        // if we want to covert the sring into a local time then...we used>>
        LocalTime par = LocalTime.parse("15:30:45");
        System.out.println(par);
        LocalDateTime customDate = LocalDateTime.parse("2026-10-26T13:48");
        System.out.println(customDate);
    }
}

