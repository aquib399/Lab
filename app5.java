//Hybrid
class HumanBody {
    public void displayHuman() {
        System.out.println("Method defined inside HumanBody class");
    }
}

interface Male {
    public void show();
}

interface Female {
    public void show();
}

public class app5 extends HumanBody implements Male, Female {
    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }

    public void displayChild() {
        System.out.println("Method defined inside Child class");
    }

    public static void main(String args[]) {
        app5 obj = new app5();
        obj.displayHuman();
        obj.show();
        obj.displayChild();
    }
}
