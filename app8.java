//Method overloading - type of arguments
public class app8 {
    void sqaure(int a) {
        System.out.println("Sqaure is : " + (a * a));
    }

    void sqaure(double a) {
        System.out.println("Sqaure is : " + (a * a));
    }

    public static void main(String[] args) {
        app8 app = new app8();
        app.sqaure(6);
        app.sqaure(5.5);
    }
}
