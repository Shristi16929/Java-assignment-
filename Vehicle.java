public class Vehicle{
  public static void main(String args[]){
            Bus bus = new Bus("B123", 6, 80, 40, "City Mall", 20.5, "Bhawana Kumari");
            Taxi taxi =new Taxi("T456", 4, 100, 4, 15.0);

             bus.display();
             taxi.display();
          }
    String VNo;
    int no_of_wheel;
    int max_speed;

       Vehicle (String VNo, int no_of_wheel, int max_speed){
        this.VNo=VNo;
        this.no_of_wheel=no_of_wheel;
        this.max_speed=max_speed;
       }
}
class Passenger extends Vehicle{
    int no_of_passengers;

    Passenger(String VNo, int no_of_wheel, int max_speed, int no_of_passengers){
        super( VNo, no_of_wheel, max_speed);
         this.no_of_passengers=no_of_passengers;
    }
}
class Bus extends Passenger{
    String route;
    double fare_per_person;
    String helper_name;

    Bus(String VNo, int no_of_wheel, int max_speed, int no_of_passengers,String route, double fare_per_person, String helper_name){
         super( VNo, no_of_wheel, max_speed, no_of_passengers);
         this.route=route;
         this.fare_per_person=fare_per_person;
         this.helper_name=helper_name;
    }
        void display(){
         System.out.println("Bus No: " + VNo + " , Route: " + route +   ", Helper: " + helper_name);
        }
}

     class Taxi extends Passenger{
         double fare_per_km;

         Taxi(String VNo, int no_of_wheel, int max_speed, int no_of_passengers, double fare_per_km){
             super( VNo, no_of_wheel, max_speed, no_of_passengers);
              this.fare_per_km=fare_per_km;
         }
         void display(){
             System.out.println("Taxi No: " + VNo + " , Fare per km: " + fare_per_km);
         }
     }
       
          
        