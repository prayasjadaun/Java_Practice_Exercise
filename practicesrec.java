/*
 Question-------------------------------------

 */
public class practicesrec {
    static int pattern_recursion(int n){
        if(n>0){
            pattern_recursion(n-1);
            for(int i =0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[]args){
        pattern_recursion(7);
    }
}
