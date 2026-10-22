import java.util.*;
import java.util.stream.*;
// Sorted  function-----it will print the output in ascending order
public class Sorted{
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,12,8,3,4,5);
        List<String> words = List.of("Banana", "Apple", "Orange", "Gava");
        List<String> byLength = words.stream()
        .sorted((a,b) -> a.length() - b.length())
         .collect(Collectors.toList());

         List<Integer> res = nums.stream()
         .sorted()
         .collect(Collectors.toList());
         System.out.println(res);
         System.out.println(byLength);
        }} 