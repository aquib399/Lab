//Method overriding - number or argument
class java1 {
    void show(int a, int b) {
        System.out.println("Sum of these number are :" + (a + b));
    }
}

class java2 extends java1 {
    void show(int a, int b) {
        System.out.println("Sum of these number are :" + (a + b));
    }
}

public class app17 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show(10, 20);
        app2.show(20, 20);
    }
}