// **Function: Consumer
/* 1.Built in function interface 
 2. Predicate> test(t) T-> t/f 1/0
3. Function <T,R> : apply(t) ; T->R
consumer<Y> : T-> "hello", "hii"
*/
// Supplier Method 
import java.util.function.*;

class lambda3 {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Welcome to the world";
        System.out.println(message.get());
    }
}

