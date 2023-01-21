//Method-overriding
class java1 {
    void show() {
        System.out.println("This is parent class");
    }
}

class java2 extends java1 {
    void show() {
        System.out.println("This is child-class");
    }
}

public class app9 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show();
        app2.show();
    }
}
