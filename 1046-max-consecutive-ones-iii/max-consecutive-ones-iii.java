class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int window = 0;
        int zero = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 1){
                zero++;
            }
            if(zero > k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            window = Math.max(right - left + 1, window);
        }

        return window;
    }
}
