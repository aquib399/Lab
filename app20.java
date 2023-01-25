//Method overriding - Priority of return type 
class java1 {
    Object show(int a, String b) {
        System.out.println("Java1");
        return null;
    }
}

class java2 extends java1 {
    String show(int a, String b) {
        System.out.println("Java2");
        return null;
    }
}

public class app20 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show(10, "HELLO");
        app2.show(20, "GOOD");
    }
}