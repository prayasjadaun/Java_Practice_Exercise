
class Base {

    public void Method() {
        System.out.println("I am a method of class Base");
    }

}

class Derived extends Base {
    @Override
    public void Method() {
        System.out.println("I am a method of class Derived");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        Base b = new Base();
        b.Method();
        Derived d = new Derived();
        d.Method();

    }
}
