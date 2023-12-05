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
// import java.util.*;

// public class loops{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i = n; i>=1; i--){
//             System.out.println(i);
//         }
//     }
// }


















// Java Program to convert postfix to prefix
import java.util.*;

class GFG {

	// function to check if character
	// is operator or not
	static boolean isOperator(char x)
	{

		switch (x) {
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		return false;
	}

	// Convert postfix to Prefix expression
	static String postToPre(String post_exp)
	{
		Stack<String> s = new Stack<String>();

		// length of expression
		int length = post_exp.length();

		// reading from right to left
		for (int i = 0; i < length; i++) {

			// check if symbol is operator
			if (isOperator(post_exp.charAt(i))) {

				// pop two operands from stack
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();

				// concat the operands and operator
				String temp
					= post_exp.charAt(i) + op2 + op1;

				// Push String temp back to stack
				s.push(temp);
			}

			// if symbol is an operand
			else {

				// push the operand to the stack
				s.push(post_exp.charAt(i) + "");
			}
		}

		// concatenate all strings in stack and return the
		// answer
		String ans = "";
		for (String i : s)
			ans += i;
		return ans;
	}

	// Driver Code
	public static void main(String args[])
	{
		String post_exp = "ABC/-AK/L-*";

		// Function call
		System.out.println("Prefix : "
						+ postToPre(post_exp));
	}
}

// This code is contributed by Arnab Kundu
