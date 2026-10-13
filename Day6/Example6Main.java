package Day6;

public class Example6Main {
    public static void main(String[] args) {
        shape c = new Circle(4.5);
        shape s = new rectangle(2.5,3.5);
        s.setColor("orange");
        c.setColor("yellow");


        System.out.println("Color and Area of Circle :  ");
        String a =  c.getColor();
        double b = c.areaCalculator();
        System.out.println(a + " "+ b);
        System.out.println("Color and Area of Rectangle :  ");
        String e =  s.getColor();
        double d = s.areaCalculator();
        System.out.println(e + " "+ d);
    }
}
