
public class abc {

    public static int smallestMissingInteger(int[] nums) {
        int sum = 0;
        int longestSeqSum = 0;
        int longestSeqLength = 0;
    
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
    
            if (i == 0 || nums[i] != nums[i - 1] ) {
                longestSeqSum = sum;
                longestSeqLength = 1;
            } else {
                longestSeqLength++;
            }
        }
    
        int missingInteger = longestSeqSum + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= longestSeqSum) {
                missingInteger = Math.max(missingInteger, nums[i] + longestSeqLength);
            }
        }
    
        return missingInteger;
    }
    
    

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 5 };
        int result = smallestMissingInteger(nums);
        System.out.println(result);
    }

}