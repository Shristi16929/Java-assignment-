public class OverloadingTest{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        OverloadingTest over=new OverloadingTest();
        System.out.println("The sum of two numbers(20,40) is " +over.sum(20,40));
        System.out.println("The sum of three numbers(20,30,40) is " +over.sum(20,30,40));
    }
}