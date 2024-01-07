interface sampleInterface {
    void method1();

    void method2();

}

interface ChildSampleInterface extends sampleInterface {
    void method3();

    void method4();
}

class MySampleClass implements ChildSampleInterface {
    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

    @Override
    public void method3() {
        System.out.println("Method3");
    }

    @Override
    public void method4() {
        System.out.println("Method4");
    }
}

public class Inheritance_Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
