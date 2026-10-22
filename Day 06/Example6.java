package Day6;


abstract class shape{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double areaCalculator();
}

class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double areaCalculator(){
        return  (3.14f)*radius*radius;
    }
}

class rectangle extends shape{
    double length,breadth;
    rectangle(double length,double breadth){
        this.length =length;
        this.breadth = breadth;
    }
    @Override
    double areaCalculator(){
         return 2*length*breadth;
    }
}
