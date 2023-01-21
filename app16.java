abstract class car {
    int regno;

    car(int r) {
        regno = r;
    }

    abstract void print();

    abstract void steering(int direction, int angle);

    abstract void braking(int force);
}

class maruti extends car {
    maruti(int regno) {
        super(regno);
    }

    void print() {
        System.out.println("Maruti " + regno);
    }

    void steering(int direction, int angle) {
        System.out.println("ordinary steering");
    }

    void braking(int force) {
        System.out.println("hydraulic brakes");
    }
}

class santro extends car {
    santro(int regno) {
        super(regno);
    }

    void print() {
        System.out.println("Santro " + regno);
    }

    void steering(int direction, int angle) {
        System.out.println("power steering");
    }

    void braking(int force) {
        System.out.println("gas brakes");
    }
}

public class app16 {
    public static void main(String[] args) {
        maruti m = new maruti(2020);
        santro s = new santro(3020);
        car ref;
        ref = m;
        ref.print();
        ref.steering(20, 50);
        ref.braking(500);
        System.out.println("------------------------------------------");
        ref = s;
        ref.print();
        ref.steering(10, 50);
        ref.braking(250);
    }
}
