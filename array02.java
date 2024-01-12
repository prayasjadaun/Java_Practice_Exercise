// Write a java program to print the elements of an array in reverse order.
// Solution------------------------------------------------
package codewithme;

public class array02 {
    public static void main(String[] args) {
        int[] marks = { 98, 89, 80, 87, 99 };
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

    }
}
