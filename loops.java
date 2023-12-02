// While Loop---------------------------------------------------------

// import java.util.*;

// public class test{
//     public static void main(String[]args){
//         int i = 100;
//         while(i<=200){
//             System.out.println(i);
//             i++;
//         }
//     }
// }
// -------------------------------------------------------
// Question -16-Write a program to print tables
// Solution---------------------------------------
// import java.util.*;

// public class test {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int s = 10;
//     int e = 1;
//     System.out.print("Enter the Table Number: ");
//     int t = sc.nextInt();

//     while (s >= e) {
//       System.out.println(t + " * " + s + " = " + (s * t));
//       s--;
//     }

//   }

// }
import java.util.*;

public class loops{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = n; i>=1; i--){
            System.out.println(i);
        }
    }
}