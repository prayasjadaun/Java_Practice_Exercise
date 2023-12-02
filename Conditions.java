// import java.util.Scanner;

// public class Conditions {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter the number 1: ");
//             int num1 = sc.nextInt();
//             System.out.println("Enter the number 2: ");
//             int num2 = sc.nextInt();
//             System.out.println("Enter the number 3: ");
//             int num3 = sc.nextInt();
//             if (num1 > num2 && num1>num3 ) {
//                 System.out.println("The maximum number is :" + num1);
//             }
//             else if(num1<num2 && num3<num2) {
//                 System.out.println("The maximum number is : "+ num2);

//             }else{
//                 System.out.println("The maximum number is : "+ num3);
//             }
//         }

//     }
// }

import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if (num%2==0) {
                System.out.println("Even number ");
            }
            else {
                System.out.println("Odd number");
            }
        }
    }
}
