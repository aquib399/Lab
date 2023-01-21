//Runtime exceptions
class java {
    void show() throws RuntimeException {
        System.out.println("Hello world");
    }
}
public class app13 extends java {
    void show() throws RuntimeException {
        System.out.println("Good morning");
    }
    public static void main(String[] args) {
        java a = new java();
        app13 b = new app13();
        a.show();
        b.show();
    }
}
