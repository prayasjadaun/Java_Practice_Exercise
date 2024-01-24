import java.util.*;

class MyException extends Exception {
    public String toString() {
        return "I am toString()";
    }

    public String getMessage() {
        return "I am getMessage";
    }
}

public class Exception39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if (a < 10) {

            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
        else{
            System.out.println("The number is greater than 10 !");
        }
    }
}
