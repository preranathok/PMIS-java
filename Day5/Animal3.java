package Day5;

class Animal3 {
    String name;

    Animal3(String name) {
        this.name = name;
    }

    protected void eat() {
        System.out.println("Animal is eating");
    }

}

class Dog3 extends Animal3 {

    Dog3(String name)
    {
        super(name);
    }

    void bark()
    {
        System.out.println(name + " "+ " is barking");
    }


}


