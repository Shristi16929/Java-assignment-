  public class Inheritance{
    public static void main(String args[]){
      Car myCar= new Car();
      myCar.start();
      myCar.stop();
    }
  }
  class Vehicle{
    public void start(){
        System.out.println("Car has started.");
    }
  }
  class Car extends Vehicle{
    public void stop(){
        System.out.println("Car has stopped.");
    }
  }