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
// Write a program to sum first n even numbers using for loop.
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

// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " X " + i + " = " + (i * n));
//         }

//     }
// }
// -------------------------------------------------------------------------
// Question-4-Write a program to print multiplication table of a given number in reverse number.
// Solution------------------------------------------------------------------------

// import java.util.*;

// public class practicesLoops {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = sc.nextInt();

//     for (int i = 10; i >= 1; i--) {
//         System.out.println(n + " X " + i + " = " + (i * n));
//     }

// }
// }.
// -----------------------------------------------------------------
// Question-5-Write a program to fint a factorial of a given number using for loop.
// Solution---------------------------------------------------------

// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int fact = 1;
//         for (int i = fact; i <= n; i++) {
//             fact *= i;
//         }
//         System.out.println(fact);
//     }
// }
// ---------------------------------------------------------------------
// Question-6- Repeat 5 using while loop
// Solution------------------------------

// import java.util.*;

// public class practicesLoops{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int fact = 1;
//         int i = 1;
//         while(i<= n){
//             fact*=i;
//             i++;
//         }System.out.println(fact);
//     }
// }
// -------------------------------------------------------------------------
// Question-7-Write a program to print a following problem using while loop
// *****
// ****
// ***
// **
// *
// Solution-------------------------------------
// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int i = 0;
//         while (i < n) {
//             int j = n - i;
//             while (j > 0) {
//                 System.out.print("*");
//                 j--;
//             }
//             System.out.println();
//             i++;
//         }
//     }
// }
// ----------------------------------------------------

// Question-8- Write a program to calculate the sum of the numbers
// occuring in the multiplication table of n.

// Solution-----------------------------------------

// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;

//         for (int i = 1; i <= 10; i++) {
//             sum +=n * i;
//             System.out.println(n + " * " + i + " = " + (i * n));
//         }
//         System.out.println("The sum of the table is: "+sum);
//     }
// }

// Question-9- Write a program to sum first n even numbers using while loop
// Solution-------------------------------------------------

// import java.util.*;

// public class practicesLoops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 0;

//         while (i < n) {
//             sum = sum + (2 * i);
//             i++;
//         }
//         System.out.println(sum);
//     }
// }
// ------------------------------------------------------------------

// Question-10- Write a program to find the value of one number raised to the power of another
// Solution--------------------------------------------------------

import java.util.*;

public class practicesLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the power number");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }
}
