//Hierarchical inheritance
class java1 {
    void display() {
        System.out.println("This is parent class");
    }
}
class java2 extends java1 {
    void show() {
        System.out.println("This is child class 1");
    }
}
class java3 extends java1 {
    void output() {
        System.out.println("This is child class 2");
    }
}
public class app4 {
    public static void main(String[] args) {

        java1 obj1 = new java1();
        java2 obj2 = new java2();
        java3 obj3 = new java3();

        obj1.display();
        System.out.println("---------------");

        obj2.show();
        obj2.display();

        System.out.println("---------------");

        obj3.output();
        obj3.display();
    }
}
