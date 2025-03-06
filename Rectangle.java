public class Rectangle{
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    double area(){
        return length*breadth;
    }
    public static void main(String args[]){
        Rectangle rect=new Rectangle(100,200);
        System.out.println("Area:" +rect.area());
    }
}