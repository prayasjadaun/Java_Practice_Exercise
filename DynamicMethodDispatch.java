class Phone {
    public void Swagat() {
        System.out.println("Namaskaar");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[]args){
        Phone obj = new SmartPhone();
        obj.Swagat();
        obj.on();
    }
}
