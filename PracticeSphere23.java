
class Sphere {
    private int Radius;

    public Sphere(int Radius) {
        this.Radius = Radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * Radius * Radius;
    }

    public double volume() {
        return 4.0 / 3 * Math.PI * Radius * Radius * Radius;
    }

}

public class PracticeSphere23 {
    public static void main(String[] args) {
        Sphere sp = new Sphere(2);
        System.out.println(sp.getRadius());
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
    }
}
