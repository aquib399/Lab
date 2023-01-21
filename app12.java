// Checked exception
class java {
    void show() throws Exception {
        System.out.println("Hello world");
    }
}

public class app12 extends java {
    void show() { // Checked exception
        System.out.println("Good morning");
    }

    public static void main(String[] args) throws Exception {
        java a = new java();
        app12 b = new app12();
        try {
            a.show();
            b.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}