package Day6;

class Address {
    String name;
    String city;
    int pincode;

    Address(String name ,String city ,int pincode){
        this.name = name;
        this.city = city;
        this.pincode = pincode;

    }
    void displayAddress(){
        System.out.println("Name"+ " "+ name + "City" + " " + city + "Pincode" +  " " + pincode);
    }
}

class Student{
    String name;
    int rollNo;
    Address address;

    Student(String name,int rollNo ,Address address){
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
  void displayStudentInfo(){
      System.out.println("Name"+ " "+ name );
      System.out.println("Roll Number" + " " +  rollNo);
      System.out.println( "Address" +  " " );
      address.displayAddress();
  }

}
