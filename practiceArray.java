//  Question-1-Create an array of 5 floats and calculate their sum.
// Solution-------------------------------------

// public class practiceArray {
//     public static void main(String[] args){
//         float [] marks = {90.4f, 98.9f,89.7f,99.9f,89.09f};
//         float sum = 0;
//         for(float elements: marks){
//             sum = sum + elements;
//         }
//         System.out.println("The sum is: "+sum);

//     }
// }
// -------------------------------------------------------------------
// Question-2-Write a program to Sort Numeric Array in Ascending Order.
// Solution-------------------------------
import java.util.*;
public class practiceArray{
    public static void main(String[]args){
        int [] arr = {23,97,56,34,134,87,56,76};
        System.out.println("Oringin Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}