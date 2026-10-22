
// import java.util.*;
// import java.util.stream.*;

// public class StreamAPI {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 5);

//         List<Integer> result = nums.stream()
//                 .filter(n -> n % 2 == 0)
//                 .map(n -> n * n)
//                 .collect(Collectors.toList());
//         System.out.println("OG List:" + nums);
//         System.out.println("result :" + result);
//     }
// }

/*Inside API we have Three Pillars
source(where the data comes from) [my_list.stream()]-> Intermediate operations (transform/filters) {.filter(), .map()....}
} -> Terminal operations(produce the final result)[collect(),,count()]
*/


import java.util.*;
import java.util.stream.*;

class StreamAPI {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c");

        System.out.println("Stream from a list:");
        list.stream().forEach(System.out::println);

        int[] arr = {1, 2, 3};

        System.out.println("Stream from an array:");
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("Stream from values:");
        Stream.of(1, 5).forEach(System.out::println);
    }
}
