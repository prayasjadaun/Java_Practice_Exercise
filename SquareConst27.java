
class Square {
    private int Area;
    private int perimeter;

    public Square(int Area, int perimeter) {
        this.Area = Area;
        this.perimeter = perimeter;
    }

    public int getAre() {
        return Area * Area;
    }

    public void setArea(int Area) {
        this.Area = Area;
    }

    public int getperimeter() {
        return 4 * perimeter;
    }

    public void setperimeter(int perimeter) {
        this.perimeter = perimeter;
    }

}

public class SquareConst27 {
    public static void main(String[] args) {
        Square sq = new Square(4, 2);
        System.out.println(sq.getAre());
        System.out.println(sq.getperimeter());
    }
}
