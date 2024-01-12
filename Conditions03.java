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
// //             else if(num1<num2 && num3<num2) {
// //                 System.out.println("The maximum number is : "+ num2);

// //             }else{
// //                 System.out.println("The maximum number is : "+ num3);
// //             }
// //         }

// //     }
// // }

// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.println("Enter the number: ");
//             int num = sc.nextInt();
//             if (num%2==0) {
//                 System.out.println("Even number ");
//             }
//             else {
//                 System.out.println("Odd number");
//             }
//         }
//     }
// }
public class Conditions03  {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }
}












// ------------------------------



























// public class BinarySearch {
//     public static int search(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid; // Element found at index mid
//             } else if (arr[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return -1; // Element not found
//     }
// }
