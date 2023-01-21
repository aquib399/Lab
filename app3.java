//Multiple inheritance
interface intr1 {
    void show();
}

interface intr2 {
    void display();
}

class java implements intr1, intr2 {
    public void show(){
        System.out.println("Hello world");
    }
    public void display(){
        System.out.println("Good morning");
    }
}

public class app3 extends java{
    public static void main(String[] args) {
        app3 app = new app3();
        app.show();
        app.display();
    }
}
