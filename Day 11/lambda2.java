import java.util.function.Function;

public class lambda2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;

        int number = 5;
        System.out.println("Square of " + number + " = " + square.apply(number));
    }
}