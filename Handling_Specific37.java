import java.util.*;

public class Handling_Specific37 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 99;
        marks[1] = 88;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 89;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value  of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occured");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException error occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Other error occured");
            System.out.println(e);
        }

    }
}
