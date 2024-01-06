
class Base {

    Base() {
        System.out.println("I am base const");
    }

    Base(int x) {
        System.out.println("I am base const with value of x as " + x);
    }

}

class Derived extends Base {

    Derived() {
        System.out.println("I am Deived Const");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am Deived Const with vaouse of y as " + y);
    }

}

public class ConstInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        Derived d = new Derived(14, 15);
        // System.out.println(b.getX());
        // System.out.println(d.getY());

    }
}
