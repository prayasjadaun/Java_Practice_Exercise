// import java.util.Scanner;

public class Exception_Handling36 {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        try {
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter b: ");
            int a = 5;
            // int b = sc.nextInt();
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
    }
}
