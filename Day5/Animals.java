package Day5;

class Animals {
       void eat(){
           System.out.println("animals eat");
       }
}

class Dogs extends Animals{
    void eat(){
        System.out.println("dog is eating");
        super.eat();
    }
}