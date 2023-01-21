//Unchecked exceptions
class java {
    void show() {
        System.out.println("Hello world");
    }
}

public class app11 extends java {
    void show() throws ArithmeticException { // Unchecked exception
        System.out.println("Good morning");
    }

    public static void main(String[] args) {
        java a = new java();
        app11 b = new app11();

        a.show();
        b.show();
    }
}
