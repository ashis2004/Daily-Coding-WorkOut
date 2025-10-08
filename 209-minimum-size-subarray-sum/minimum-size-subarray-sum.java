class Solution {
     public int minSubArrayLen(int s, int[] A) {
        int j=0,n=A.length;
        int res=n+1;
        for(int i=0;i<n;i++){
            s-=A[i];
            while(s<=0){
                
                res=Math.min(res,i-j+1);
                s+=A[j++];
            }
        }
        return res%(n+1);
       
     }
}




// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int minLen = Integer.MAX_VALUE;
//         int left = 0;
//         int curSum = 0;

//         for (int right = 0; right < nums.length; right++) {
//             curSum += nums[right];

//             while (curSum >= target) {
//                 if (right - left + 1 < minLen) {
//                     minLen = right - left + 1;
//                 }
//                 curSum -= nums[left];
//                 left++;
//             }
//         }
        
//         return minLen != Integer.MAX_VALUE ? minLen : 0;        
//     }
// }