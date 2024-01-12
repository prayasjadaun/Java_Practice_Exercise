// Q1. Write a program to find maximum between two numbers?
// Solution--

// import java.util.*;

// public class MaxTwoNumbers{
//  public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter num1: ");
//   int num1 = sc.nextInt();
//   System.out.println("Enter num2: ");
//   int num2 = sc.nextInt();
//   if(num1>num2){
//    System.out.println("The maximum number is: "+num1); 
//   }
//   else if(num1<num2){
//    System.out.println("The maximum number is: "+num2);

//   }

//   else{
//    System.out.println("Both are same"+ num1);
//   }
//  }
// }

// Q2. Write a program to find maximum between three numbers?
// Solution---

// import java.util.*;

// public class MaxThreeNumber{
//  public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//   System.out.print("Enter the num1: ");
//   int num1 = sc.nextInt();
//   System.out.print("Enter the num2: ");
//   int num2 = sc.nextInt();
//   System.out.print("Enter the num3: ");
//   int num3 = sc.nextInt();
//   if(num1>num2 && num1>num3){
//   System.out.println("The maximum number is: "+num1);
//   }
//   else if(num1<num2 && num3<num2){
//   System.out.println("The maximum number is: "+num2);
//   }
//   else{
//   System.out.println("The maximum number is: "+num3);

//   }
//  }
// }

// Q3. Write a program to check whether a character is alphabet or not?
// Solution---

// import java.util.*;

// public class check_Alphabet{
//  public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//   System.out.print("Enter Alphabet: ");
//    char ch = sc.next().charAt(0);
//    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
//    System.out.println("This is alphabet");
//   }
//   else{
//   System.out.println("This is not alphabet");
//   }

//  }

// }

// Q4. Write a program to input any alphabet and check whether is is vowel od consonant?
// Solution----

// import java.util.*;

// public class vowel_consonant{
//  public static void main(String[] args){
//  Scanner sc = new Scanner(System.in);
//   System.out.print("Enter the character: ");
//   char ch = sc.next().charAt(0);
//   if(ch=='a'|| ch=='e' || ch== 'i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U'){
// System.out.println("This is Vowel");
// }
//   else{
//   System.out.println("This is Consonant");
//   }
//  }
// }

// Q5. Write a program to find out whether a student is pass of fail; if it 
// requeres total 40% and at least 33% in each student to pass.
// Assuem 3 Students and take marks as an input from the user.

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your DBMS Marks: ");
//         int DBMS = sc.nextInt();
//         System.out.print("Enter your DSA Marks: ");
//         int DSA = sc.nextInt();
//         System.out.print("Enter your Quant Marks: ");
//         int Quant = sc.nextInt();
//         float avg = (DBMS + DSA + Quant) / 3.0f;
//         System.out.println("Your overall percentage is: " + avg);

//         if (avg >= 40 && DBMS >= 33 && DSA >= 33 && Quant >= 33) {
//             System.out.println("You have been promoted");
//         } else {
//             System.out.println("Yout have not promoted");
//         }

//     }
// }

// Q6. Calculate income tax by an employee to the government as percentage
// per th slabs mentioned below:
// income slab        tax
// 2.5L-5.0L          5%
// 5.0L-10.0L         20%
// Above 10L          30%

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income in lakhs per annum: ");
//         float tax = 0;
//         float income = sc.nextFloat();
//         if (income <= 2.5f) {
//             tax = tax + 0;
//         } else if (income > 2.5f && income <= 5f) {
//             tax = tax + 0.05f * (income - 2.5f);
//         } else if (income > 5f && income <= 10.0f) {
//             tax = tax + 0.05f * (5f - 2.5f);
//             tax = tax + 0.2f * (income - 5f);
//         } else if (income > 10.0f) {
//             tax = tax + 0.05f * (5.0f - 2.5f);
//             tax = tax + 0.2f * (10.0f - 5f);
//             tax = tax + 0.3f * (income - 10.0f);
//         } 
//             System.out.println("Your income tax as per you salary: "+tax);

//     }
// }

// Q7. write a java program to find out the day of the week given the number
// [1 for sunday, 2 for monday.... and so on!]
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of the day: ");
//         int day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Sunday");

//                 break;
//             case 2:
//                 System.out.println("Monday");

//                 break;
//             case 3:
//                 System.out.println("Tuesday");

//                 break;
//             case 4:
//                 System.out.println("Wednesday");

//                 break;
//             case 5:
//                 System.out.println("Thursday");

//                 break;
//             case 6:
//                 System.out.println("Friday");

//                 break;
//             case 7:
//                 System.out.println("Saturday");

//                 break;

//             default:
//                 System.out.println("Invalid number of the week");
//                 break;

//             //  Enhance Switch case

//             case 1 -> System.out.println("Sunday");
//             case 2 -> System.out.println("Monday");
//             case 3 -> System.out.println("Tuesday");
//             case 4 -> System.out.println("Wednesday");
//             case 5 -> System.out.println("Thursday");
//             case 6 -> System.out.println("Friday");
//             case 7 -> System.out.println("Saturday");
//         }
//     }
// }
// Question-12- Write a program to find out the type of website from the url?
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Website url: ");
//         String website = sc.next();
//         if (website.endsWith(".com")) {
//             System.out.println("This is Comercial Website ! ");
//         } else if (website.endsWith(".org")) {
//             System.out.println(" This is Organization Website ! ");
//         } else if (website.endsWith(".in")) {
//             System.out.println("This is Indian Website ! ");
//         }
//     }
// }
// Question-13- Write a java program to find whether a year entered by the user is a leap year or not?

// import java.util.*;

// public class test{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the year: ");

//         int year = sc.nextInt();

//         if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0 )){
//             System.out.println(year + " is a leap year");
//         }
//         else {
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }

// Question-14- Write a program to input marks of five subjects Physics, Chemistery, Biology, Mathematics and Computer. Calculate percentage and grade according to folowing:
// * Percentage >= 90% : Grade A
// * Percentage >= 80% : Grade B
// * Percentage >= 70% : Grade C
// * Percentage >= 60% : Grade D
// * Percentage >= 50% : Grade E
// * Percentage >= 40% : Grade F
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the marks of Physics: ");
//         int m1 = sc.nextInt();
//         System.out.print("Enter the marks of Chemistry: ");
//         int m2 = sc.nextInt();
//         System.out.print("Enter the marks of Biology: ");
//         int m3 = sc.nextInt();
//         System.out.print("Enter the marks of Mathematics: ");
//         int m4 = sc.nextInt();
//         System.out.print("Enter the marks of Computer: ");
//         int m5 = sc.nextInt();

//         int tot = m1 + m2 + m3 + m4 + m5;
//         float per = tot / 5;
//         System.out.println("Total: " + tot);
//         System.out.println("Percentage: " + per);

//         if (per >= 90) {
//             System.out.println("Grade A");
//         } else if (per >= 80) {
//             System.out.println("Grade B");
//         } else if (per >= 70) {
//             System.out.println("Grade C");
//         } else if (per >= 60) {
//             System.out.println("Grade D");
//         } else if (per >= 50) {
//             System.out.println("Grade E");
//         } else {
//             System.out.println("Grade F");
//         }
//     }
// }
// Question-15- Write a program to input basic salary of an employee and calculate its Gross salary according to folling:
// Basic Salary<= 10000:HRA = 20%,DA=80%
// Basic Salary<= 20000: HRA=25%,DA=90%
// Basic Salary> 20000:HRA=30%,DA=95%

// Solution----

// import java.util.*;

// public class test{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Basic Salary: ");
//         int bs = sc.nextInt();
//         float hra, da;
//         if(bs<=10000){
//             hra = bs*0.2f;
//             da = bs*0.8f;
//         }
//         else if(bs<=20000){
//             hra = bs*0.25f;
//             da = bs*0.9f;
//         }
//         else{
//             hra = bs* 0.3f;
//             da = bs* 0.95f;
//         }
//         System.out.println("Gross Salary: "+(hra+da+bs));
//     }
// }
import java.util.Stack;
public class test28 {
    // Method to evaluate postfix expression
    public static int main(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

























// // Method to evaluate prefix expression
// public static int evaluatePrefix(String exp) {
// Stack<Integer> stack = new Stack<>();

// for (int i = exp.length() - 1; i >= 0; i--) {
// char c = exp.charAt(i);

// if (Character.isDigit(c)) {
// stack.push(c - '0');
// } else {
// int val1 = stack.pop();
// int val2 = stack.pop();

// switch (c) {
// case '+':
// stack.push(val1 + val2);
// break;
// case '-':
// stack.push(val1 - val2);
// break;
// case '*':
// stack.push(val1 * val2);
// break;
// case '/':
// stack.push(val1 / val2);
// break;
// }
// }
// }
// return stack.pop();
// }

// public static void main(String[] args) {
// String postfixExp = "34+2*";
// String prefixExp = "*+34+23";

// System.out.println("Postfix evaluation result: " +
// evaluatePostfix(postfixExp));
// System.out.println("Prefix evaluation result: " + evaluatePrefix(prefixExp));
// }
// }
