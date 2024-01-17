class Base2 {

    Base2() {
        System.out.println("I am Base const");
    }

    Base2(int x) {
        System.out.println("I am overload constructor with value of x as " + x);
    }

}

class Derived extends Base2 {

    Derived() {
        System.out.println("I am Deived Const");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am overload Deived Constructor with value of y as " + y);
    }

}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am Child of derived  constructor ");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overload Child of derived constructor with value of z as " + z);
    }
}

public class ConstInheritance04 {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived(14, 15);
        // ChildOfDerived cd = new ChildOfDerived();
         new ChildOfDerived(10, 20, 30);

    }
}
