
public class AccessModifierExample{
    public static void main(String args[]){
       Student student =new Student();
       student.display();
       System.out.println("Age is:" +student.getAge());
       student.setAge(30);
       System.out.println("Updated Age:" +student.getAge());
    }
}
class Person{
        public String Name ="Shristi Jaysawal";
         String Stream ="Bachelor";
        private int Age =19;
        protected long Number=9820849056L;
        public int getAge(){
            return Age;
        }
        public void setAge(int age){
          this.Age=age;
        }     
}
class Student extends Person{
    public void display(){
        System.out.println("Name:" +Name);
        System.out.println("Stream:" +Stream);
        System.out.println("Number:" +Number);
        
    }
}