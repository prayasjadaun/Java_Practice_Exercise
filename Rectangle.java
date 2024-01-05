
class MyRectangle {
    private int length;
    private int width;

    public MyRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

public class Rectangle {

    public static void main(String[] args) {

        MyRectangle r = new MyRectangle(10, 5);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
    }
}
