//Method overriding - sequence or argument
class java1 {
    void show(int a, String b) {
        System.out.println("Java1");
    }
}

class java2 extends java1 {
    void show(int a, String b) {
        System.out.println("Java2");
    }
}

public class app18 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show(10,"HELLO");
        app2.show(20,"GOOD");
    }
}