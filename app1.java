//single inheritance
class java{
    void show(){
        System.out.println("Hello world");
    }
}
public class app1 extends java{
    public static void main(String[] args) {
        app1 app = new app1();
        app.show();
    }
}
