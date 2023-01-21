//overloading main
public class app10 {
    public void main() {
        System.out.println("This is null main");
    }

    public void main(int a) {
        System.out.println("The value is : " + a);
    }

    public static void main(String[] args) {
        System.out.println("JVM read this main");
        app10 app = new app10();
        app.main();
        app.main(10);
    }

}
