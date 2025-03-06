public class SampleClass{
    int a;
    int b=20;
    void display1(){
        System.out.println("Number:" +a);
    }
    void display2(){
        System.out.println("Number:" +b);
    }
    public static void main(String args[]){
        SampleClass obj=new SampleClass();
        obj.a=10;
        obj.display1();
        obj.display2();
    }
}
