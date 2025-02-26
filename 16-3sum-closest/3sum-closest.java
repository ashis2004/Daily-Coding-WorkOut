import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array to enable two-pointer approach
        int closestSum = Integer.MAX_VALUE; // Initialize closest sum to a large value
        int minDiff = Integer.MAX_VALUE; // Initialize minimum difference to a large value

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; // Pointer for the element on the left
            int right = nums.length - 1; // Pointer for the element on the right

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the current sum

                int diff = Math.abs(sum - target); // Calculate the absolute difference between current sum and target
                if (diff < minDiff) { // Update the minimum difference and closest sum if necessary
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++; // If current sum is less than target, increment the left pointer
                } else if (sum > target) {
                    right--; // If current sum is greater than target, decrement the right pointer
                } else {
                    return sum; // If current sum is equal to target, return it as the closest sum
                }
            }
        }

        return closestSum; // Return the closest sum after traversing the entire array
    }
}