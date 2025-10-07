class Solution {
    public int longestOnes(int[] nums, int k) {
       int l=0;
       int w=0;
       int z=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=1){
            z++;
        }
        if(z>k){
            if(nums[l++]==0) z--;
        }
        w=Math.max(w,i-l+1);
       }
       return w;
    }
}

 