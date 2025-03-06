public class OverridingExample{
        public static void main(String args[]){
            Parent obj1= new Parent();
            Parent obj2= new Child();
            //Runtime polymorphism
            obj1.show();
            obj2.show();
        }
    }
 class Parent{
    void show(){
        System.out.println("Parent:");
        System.out.println("This is Parent class.");
    }
}
 class Child extends Parent{
  @Override
  void show(){
     System.out.println("Child:");
     System.out.println("This is Child class(Overridden Method).");
  }
 }
    