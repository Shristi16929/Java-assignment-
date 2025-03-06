public class Circle{
    final double PI=3.14159;
    double r;
    void getData(double radius){
        r=radius;
    }
    double calculate(){
        return PI*r*r;
    }
    public static void main(String args[]){
        Circle c=new Circle();
        c.getData(6);
        System.out.println("Area of circle:" +c.calculate());
    }

}