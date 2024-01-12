class Circle {
    public int radius;

    Circle(int r) {
        System.out.println("I am circle constructor");
        this.radius = r;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

}

class MyCylinder extends Circle {
    public int height;

    MyCylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }
}

public class PracticeInheritance20 {
    public static void main(String[] args) {
        Circle cr = new Circle(3);
        System.out.println(cr.Area());
        MyCylinder cl = new MyCylinder(2, 4);
        System.out.println(cl.Volume());
    }
}
