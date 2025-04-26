public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return countWays(nums, 0, 0, target);
    }

    private int countWays(int[] nums, int index, int currentSum, int target) {
        if (index == nums.length) {
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        // Choose +nums[index]
        int add = countWays(nums, index + 1, currentSum + nums[index], target);
        
        // Choose -nums[index]
        int subtract = countWays(nums, index + 1, currentSum - nums[index], target);

        return add + subtract;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.findTargetSumWays(new int[]{1,1,1,1,1}, 3)); // Output: 5
        System.out.println(sol.findTargetSumWays(new int[]{1}, 1));          // Output: 1
    }
}
