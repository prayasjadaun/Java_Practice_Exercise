import java.util.*;

public class Nested_Exception38 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 98;
        marks[1] = 90;
        marks[2] = 99;
        marks[3] = 90;
        marks[4] = 87;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.println("Enter the value of index: ");
            int ind = sc.nextInt();

            try {
                System.out.println("This is nested exception handling in java");

                try {
                    System.out.println(marks[ind]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("This is nested exception handling level two");
                }
            } catch (Exception e) {
                System.out.println("Exception handling level 2");
            }
        }
    }
}
