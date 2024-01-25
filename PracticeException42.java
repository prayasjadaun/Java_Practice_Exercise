import java.util.*;

public class PracticeException42 {
    public static void main(String[] args) {
        // Problem--1

        try {
            int a = 50 / 9;

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("ArithmeticArgumentException");
        }

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int[] marks = new int[5];
        marks[0] = 98;
        marks[1] = 89;
        marks[2] = 99;
        marks[3] = 90;
        marks[4] = 89;
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the number of  index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Invalid Index");
                i++;
            }
        }
    }
}
