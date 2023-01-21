//multi-level inheritance
class java1{
    void show(){
        System.out.println("Hello world");
    }
}
class java2 extends java1{
    void display(){
        System.out.println("Good morning");
    }
}
public class app2 extends java2{
    public static void main(String[] args) {
        app2 app = new app2();
        app.show();
        app.display();
    }
}
