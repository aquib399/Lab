//Method overloading - sequence of arguments
public class app7 {
    void show(int a, String b) {
        System.out.println("int then string");
    }

    void show(String a, int b) {
        System.out.println("String then int");
    }

    public static void main(String[] args) {
        app7 app = new app7();
        app.show(10,"ABC");
        app.show("XYZ",20);
    }
}
