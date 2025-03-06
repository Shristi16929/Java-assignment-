import java.util.*;
public class RectangleModified{
    double length;
    double breadth;
    RectangleModified(double l,double b){
        length=l;
        breadth=b;
    }
    double area(){
        return length*breadth;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length:");
       double l=sc.nextDouble();
        System.out.println("Enter breadth:");
        double b=sc.nextDouble();
        sc.close();
        RectangleModified rect=new RectangleModified(l,b);
        System.out.println("Area:" +rect.area());

    }
}
