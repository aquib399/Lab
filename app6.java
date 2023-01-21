//Method overloading - number of arguments
public class app6 {
    void add(int a, int b) {
        System.out.println("Sum : " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum : " + (a + b + c));
    }

    public static void main(String[] args) {
        app6 app = new app6();
        app.add(10, 20);
        app.add(10, 20, 30);
    }
}
