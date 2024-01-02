
// Linear Search------------------------
public class practical {
    public static int liner(int arr[], int x) {
        for (int i = 0; i < arr.length;) {
            if (arr[i] == x) {

            }
            return i;
        }
        return x;
    }
}

// Binary Search----------------------------
// public class practical {
//     public static int binary(int[] arr, int x) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (x == arr[mid]) {
//                 return mid;
//             } else if (x > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }

// import java.util.*;

// class GFG {

// static boolean isOperator(char x) {

// switch (x) {
// case '+':
// case '-':
// case '/':
// case '*':
// return true;
// }
// return false;
// }

// static String postToPre(String post_exp) {
// Stack<String> s = new Stack<String>();

// int length = post_exp.length();

// for (int i = 0; i < length; i++) {

// if (isOperator(post_exp.charAt(i))) {

// String op1 = s.peek();
// s.pop();
// String op2 = s.peek();
// s.pop();

// String temp = post_exp.charAt(i) + op2 + op1;

// s.push(temp);
// }

// else {

// s.push(post_exp.charAt(i) + "");
// }
// }

// String ans = "";
// for (String i : s)
// ans += i;
// return ans;
// }

// public static void main(String args[]) {
// String post_exp = "ABC/-AK/L-*";
// System.out.println("Prefix : "
// + postToPre(post_exp));
// }
// }
