public class TestOverloading{
    public int sum(int a,int b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public static void main(String args[]) {
        TestOverloading over=new TestOverloading();
        System.out.println("The sum of two numbers(20,40) is " +over.sum(20,40));
        System.out.println("The sum of three numbers(30.5,20.5) is " +over.sum(30.5,20.5));
    }
}