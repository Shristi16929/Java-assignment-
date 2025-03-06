public class Person{
     String name;
     int age;
     public static void main(String[] args){
        Employee emp= new Employee();
        emp.readData("Alice", 20);
        emp.showEmployee();
    }

     void readData(String name, int age){
        this.name= name;
        this.age= age;
     }
     void displayData(){
        System.out.println("Name : "  +name + ", Age : "  +age);
     }
}
class Employee extends Person{
    void showEmployee(){
         System.out.println("Employee Details:");
         displayData();
    }
    
}