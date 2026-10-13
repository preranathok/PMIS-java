package Day5;

class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

public class inherit{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
