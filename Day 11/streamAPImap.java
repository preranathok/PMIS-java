import java.util.*;
import java.util.stream.*;

public class streamAPImap{
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,12,8,3,4,5);
         List<Integer> res = nums.stream()
         .map(n -> n*2) // intermediate operation)
         .collect(Collectors.toList());
         System.out.println(res);
        }} 