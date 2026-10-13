package Day5;

 class Employee3 {
        String name;
        double salary;

        Employee3(String name ,double salary){
            this.name = name;
            this.salary = salary;
        }

    void displayDetails(){
        System.out.println("Name of Employee :" +" "+name);
        System.out.println("Salary of Employee :"+" " + salary);
    }

}

 class Manager2 extends Employee3{
     String department;

     Manager2(String name, double salary,String department) {
         super(name,salary);
         this.department = department;
     }

     @Override
     void displayDetails() {
         super.displayDetails();
         System.out.println("Department :"+" "+ department);
         System.out.println("Role : Manager");

     }
 }
