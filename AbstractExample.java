  public class AbstractExample{
    public static void main(String args[]){
        Dog myDog =new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
  }
  abstract class Animal{
    abstract void makeSound();

    void sleep(){

        System.out.println("Sleeping.......");
    }
  }
  final class Dog extends Animal{
    void makeSound(){
        System.out.println("Barking.......");
    }
  }