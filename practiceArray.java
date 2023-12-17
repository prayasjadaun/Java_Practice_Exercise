
/* 
 Question-1-Create an array of 5 floats and calculate their sum.
Solution-------------------------------------

public class practiceArray {
    public static void main(String[] args){
        float [] marks = {90.4f, 98.9f,89.7f,99.9f,89.09f};
        float sum = 0;
        for(float elements: marks){
            sum = sum + elements;
        }
        System.out.println("The sum is: "+sum);

    }
}
-------------------------------------------------------------------
Question-2-Write a program to Sort Numeric Array in Ascending Order.
Solution-------------------------------
import java.util.*;
public class practiceArray{
    public static void main(String[]args){
        int [] arr = {23,97,56,34,134,87,56,76};
        System.out.println("Oringin Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
------------------------------------------------------------------------
Question-3--Write a java program to reverse an array.
Solution--------------------------------------------
import java.util.*;

public class practiceArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
*/
/*   
 ------------------------------------------------------------------
Question-4-Write a java program to find the maximum and minimum element in an array.
Solution---------------------------------------------------------------- 
import java.util.*;

public class practiceArray {
    public static void main(String[] args) {
        int[] arr = { 23, 56, 876, 3, 56, 78, 3, 2, 567 };
        int max = arr[0], min = arr[0];
        
        for (int element : arr) {

            if (element > max)
            max = element;
            
            if (element < min)
            min = element;
        }
        
        System.out.println("The maximum element is : " + max);
        System.out.println("the minimum element is: " + min);
    }
}
-----------------------------------------------------------------
Question-5-Write a program to array elements print all odd numbers.
Solution---------------------------------------------------------
import java.util.*;

public class practiceArray {
    public static void main(String[] args) {
        int[] arr = { 23, 54, 65, 32, 67, 89, 90 };
        for (int odd : arr) {
            if (odd % 2 == 1) {
                System.out.println(odd);
            }
            
        }
    }
}
---------------------------------------------------------------------
Question-6-Write a program to array elements to print sum of cubic value.
Solution------------------------------------------------------------------
import java.util.*;
public class practiceArray{
    public static void main(String[]args){
        int [] arr = {23,43,67,31,77,65};
        for(int cubic:arr){
            
        }
    }
}


1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*;

public class practiceArray {
    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                    
                }
            }
        }
        return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 13 };
        int target = 9;
        int[] ans = twoSum(nums, target);
        
        System.out.println(ans[0] +" "+ ans[1]);
    }
    
}
*/
import java.util.Scanner;
public class practiceArray{

	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.printf("Element of a[%d] :",i);
			a[i]=input.nextInt();
		}
		System.out.print("Enter the Search Array Element :");
		int s =input.nextInt();
		int i,f=0;
		for(i=0; i<l; i++)
		{
			if(a[i]==s)
			{				
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.printf("The Element is found in the position : %d", i + 1);
			System.out.printf("\nThe Element is found in the index : %d", i);
		}
		else
		{
			System.out.println("The Element is Not found");
		}
    }
}
