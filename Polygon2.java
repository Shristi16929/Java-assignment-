class Polygon2{
        public static void main(String args[]){
            Rectangle rect = new Rectangle(10,4);
            Triangle tri = new Triangle(8,6);

            System.out.println("Area of Rectangle:" + rect.getArea());
            System.out.println("Area of Triangle:" + tri.getArea());
        }



    double length, width;

    Polygon2(double length, double width){
        this.length=length;
        this.width=width;
    }
}
class Rectangle extends Polygon2{
    Rectangle(double length, double width){
        super(length,width);
    }
    double getArea(){
        return length*width;
    }
}
class Triangle extends Polygon2{
    Triangle(double base, double height){
         super(base, height);
    }
    double getArea(){
        return 0.5*length*width;
    }
}