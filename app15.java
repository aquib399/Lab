//Method abstraction
abstract class MyClass {
    abstract void calculate(double x);
}
class java1 extends MyClass{
    void calculate(double x){
        System.out.println("Sqaure : "+(x*x));
    }
}
class java2 extends MyClass{
    void calculate(double x){
        System.out.println("Sqaure root : "+Math.sqrt(x));
    }
}
class java3 extends MyClass{
    void calculate(double x){
        System.out.println("Cube : "+(x*x*x));
    }
}
public class app15{
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();
        java3 app3 = new java3();
        app1.calculate(12);
        app2.calculate(144);
        app3.calculate(4);
    }
}
