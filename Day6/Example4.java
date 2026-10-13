package Day6;

class Student1 {
    String name;
    static  String collegeName = "Watumull Institute";

    Student1(String name){
        this.name = name;
    }
    void displayNameCollege(){
        System.out.println("Student Name :"+ " "+ name + " "+ "College Name " + " " + collegeName);
    }
}
