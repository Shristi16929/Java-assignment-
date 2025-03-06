public class Box{
    double length;
    double breadth;
    double height;
    public void readData(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        }
        double volume(){
            return this.length*this.breadth*this.height;
        }
    
    public static void main(String args[]){
        Box box =new Box();
        box.readData(10,5,2);
        System.out.println("Volume of the box is:" +box.volume());

    }
}