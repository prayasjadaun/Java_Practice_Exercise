//  Question-1-Create an array of 5 floats and calculate their sum.
// Solution-------------------------------------

public class practiceArray {
    public static void main(String[] args){
        float [] marks = {90.4f, 98.9f,89.7f,99.9f,89.09f};
        float sum = 0;
        for(float elements: marks){
            sum = sum + elements;
        }
        System.out.println(sum);

    }
}
