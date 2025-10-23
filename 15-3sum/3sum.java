
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(nums);
      int n = nums.length;
      for(int i=0; i<n-2; i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
       int st=i+1, end=n-1;
       while(st<end){
        int target = nums[i]+nums[st]+nums[end];
        if(target==0){
        ans.add(Arrays.asList(nums[i],nums[st],nums[end]));
          while(st<end && nums[st]==nums[st+1]) st++;
          while(st<end && nums[end]==nums[end-1]) end--;
          st++;
          end--;
        }
        else if(target<0){
            st++;
        }
        else{
            end--;
        }
       }
       
      }
      return ans;
    }
}