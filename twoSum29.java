public class twoSum29 {

    public static int[] TwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum(nums, target);

        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}