public class Polygon{
     double dimension1;
     double dimension2;
     
       public static void main(String args[]){
          Rectangle rect =new Rectangle();
          rect.readDimension(10,5);
          System.out.println("Rectangle Area :" + rect.calculateArea());

          Triangle tri =new Triangle();
          tri.readDimension(10,5);
          System.out.println("Triangle Area :" + tri.calculateArea());
     }

     void readDimension(double d1, double d2){
           this.dimension1=d1;
           this.dimension2=d2;
     }
}
class Rectangle extends Polygon{
      double calculateArea(){
        return this.dimension1*this.dimension2;
      }
}
class Triangle extends Polygon{
    double calculateArea(){
        return 0.5*this.dimension1*this.dimension2;
    } 
     
}