class Base0 {

    public void Method() {
        System.out.println("I am a method of class Base");
    }

}

class Derived1 extends Base0 {
    
    public void Method() {
        System.out.println("I am a method of class Derived");
    }

}

public class MethodOverriding13 {

    public static void main(String[] args) {
        Base0 b = new Base0();
        b.Method();
        Derived1 d = new Derived1();
        d.Method();

    }
}
