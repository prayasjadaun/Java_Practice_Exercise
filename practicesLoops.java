// Question-1- Write a program to print a following problem
// *****
// ****
// ***
// **
// *
// Solution--------------------------------------

// public class practicesLoops {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }

// }
// --------------------------------------------------------------

// Question-2-------------------------------------
// Write a program to sum first n even numbers using while loop
// Solution-------------------------------------------------

// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;

//         for (int i = 0; i < n; i++) {
//             sum = sum + (2*i);
//             System.out.println(sum);
//         }
//     }
// }
// -----------------------------------------------------------------------------
// Question-3-Write a program to print multiplication table of a given number.
// Solution------------------------------------------------------------------------

import java.util.*;

public class practicesLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            for (int j = n; j <= n; j++) {
                System.out.println(n + "*" + i + "=" + (i * n));
            }

        }

    }
}