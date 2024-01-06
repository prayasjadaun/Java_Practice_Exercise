class Rectangle {
    public int length;
    public int width;
    public int height;

    Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int Area() {
        return width * length;
    }

    public int Volume() {
        return length * width * height;
    }
}

class Cuboid1 extends Rectangle {

    Cuboid1(int length, int width, int height) {
        super(length, width, height);

    }

    public int Area() {
        return 2 * (length * width + width * height + length * height);
    }

    public int Volume() {
        return length * width * height;
    }
}

public class Cuboid {
    public static void main(String[] args) {
        // Rectangle rc = new Rectangle(2,3,4);
        // System.out.println(rc.Area());
        // System.out.println(rc.Volume());
        Cuboid1 cb = new Cuboid1(2, 4, 5);
        System.out.println(cb.Area());
        System.out.println(cb.Volume());

    }
}
