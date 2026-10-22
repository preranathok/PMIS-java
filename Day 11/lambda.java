// @FunctionalInterface interface Greeter{
//     void greet(String name);
// }
// public class lambda{
//     public static void main(String[] args){
//         Greeter g = new Greeter(){
//             @Override public void greet(String name){
//                 System.out.println("Hello" + name);
//             }
//         };
//         g.greet(name:"Peru")
//             }
//         }

// public class lambda{

// public static void main(String [] args){
//     Greeter g = name-> System.out.println("Hello, "+ name);
//     g.greet(name:"Bhumi");
// }

// }

/*
No parameters: () ->syso(Hi)
one parameters: x -> x*2
two parameters: (a,b) -> a+b;
(int a, int b) -> a+b  */
/* Built in function interface 
Predicate> test(t) T-> t/f 1/0
*/
// import java.util.*;
// import java.util.function.Predicate;
// public class lambda{
//     public static void main(String [] args){
//         Predicate <Integer> isAdult = age-> age>=18;
//         System.out.println(isAdult.test(20));
//         System.out.println(isAdult.test(15));
//     }
//     }
/*Built in function interface 
Predicate> test(t) T-> t/f 1/0
Function <T,R> : apply(t) ; T->R
*/
import java.util.function.*;
class lambda{
    public static void main(String [] args){
        Function<String, Integer> getLength = name -> name.length();
System.out.println(getLength.apply("Java"));
System.out.println(getLength.apply("John"));
}
}