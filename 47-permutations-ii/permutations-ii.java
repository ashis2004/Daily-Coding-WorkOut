import java.util.*;

class Solution {

    public void prec(int[] nums, List<Integer> l, List<List<Integer>> ans, boolean[] used) {
        if (l.size() == nums.length) {
            ans.add(new ArrayList<>(l));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            l.add(nums[i]);
            
            prec(nums, l, ans, used);
            
            l.remove(l.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        // Must sort the array to group duplicates and apply the skipping logic
        Arrays.sort(nums);

        boolean[] used = new boolean[n];
        prec(nums, new ArrayList<>(), ans, used);
        return ans;
    }
}