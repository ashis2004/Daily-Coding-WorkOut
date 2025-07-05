import java.util.Arrays;

class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        // Try to make all elements 1s
        if (check(Arrays.copyOf(nums, nums.length), k, 1)) {
            return true;
        }

        // If not possible to make all 1s, try to make all -1s
        if (check(Arrays.copyOf(nums, nums.length), k, -1)) {
            return true;
        }

        // If neither is possible, return false
        return false;
    }

    /**
     * Helper function to check if it's possible to transform the array to all 'target' elements
     * within 'k' operations using a greedy strategy.
     *
     * @param tempNums The array copy to be modified.
     * @param k        The maximum number of operations allowed.
     * @param target   The target value (1 or -1) for all elements.
     * @return True if achievable, false otherwise.
     */
    private boolean check(int[] tempNums, int k, int target) {
        int n = tempNums.length;
        int operations = 0;

        // Iterate from left to right, fixing elements greedily
        for (int i = 0; i < n - 1; i++) {
            if (tempNums[i] != target) {
                // If current element is not the target, apply the operation
                // This operation flips tempNums[i] and tempNums[i+1]
                tempNums[i] *= -1;
                tempNums[i + 1] *= -1;
                operations++;
            }
        }

        // After the loop, check the last element.
        // If it's not the target, it means this target state is unreachable
        // using the greedy left-to-right approach.
        if (tempNums[n - 1] != target) {
            return false;
        }

        // If the last element is the target, check if the total operations used
        // are within the allowed limit 'k'.
        // The problem states "at most k operations", so if we found a way in 'operations'
        // and 'operations <= k', it's valid.
        return operations <= k;
    }
}