//Method overriding - type or argument
class java1 {
    void show(String a) {
        System.out.println("Java1 " + a);
    }
}

class java2 extends java1 {
    void show(String a) {
        System.out.println("Java2 " + a);
    }
}

public class app19 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show("HELLO");
        app2.show("GOOD");
    }
}