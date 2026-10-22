package Day6;

public class Example2Main {
    public static void main(String[] args) {
        Address a = new Address("Vrindavan Complex","Dombivli" ,401232 );
        Student s = new Student("Durvesh", 66,a);
        s.displayStudentInfo();
    }
}
