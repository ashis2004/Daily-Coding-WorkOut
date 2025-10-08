class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        for(int a:nums){
            if(a>1L*nums[i]*k) ++i;

            
        }
        return i;
        
    }
}