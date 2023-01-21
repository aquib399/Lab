//abstract classes and methods
abstract class java1{
    abstract void cube(int a);
}
class java2 extends java1{
    void cube(int a){
        System.out.println("Cube is : "+(a*a*a));
    }
}
public class app14 {
    public static void main(String[] args) {
        java2 app = new java2();
        app.cube(5);
    }
}
