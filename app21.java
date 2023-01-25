//Method overriding - access specifier 
class java1 {
    void show() {
        System.out.println("Java1");
    }
}

class java2 extends java1 {
    public void show() {
        System.out.println("Java2");
    }
}

public class app21 {
    public static void main(String[] args) {
        java1 app1 = new java1();
        java2 app2 = new java2();

        app1.show();
        app2.show();
    }
}