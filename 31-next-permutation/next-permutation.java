// class Solution {
//     public void nextPermutation(int[] nums) {
//         int break_point = -1;
//         int n = nums.length;
//         int i = n-2;

//         while(i>=0) {
//             if(nums[i]<nums[i+1]) {
//                 break_point = i;
//                 break;
//             }
//             i--;
//         }

//         if(break_point == -1) {
//             //System.out.println("Reversing");
//             for(int k=0 ; k<n/2 ; k++) {
//                 int temp = nums[k];
//                 nums[k] = nums[n-k-1];
//                 nums[n-k-1] = temp;
//             }
//         }
//         else {

//             i = n-1;
//             while(i>0) {
//                 if(nums[i]>nums[break_point]) {
//                     int temp = nums[i];
//                     nums[i] = nums[break_point];
//                     nums[break_point] = temp;
//                     break;
//                 }
//                 i--;
//             }

//             i = n-1;
//             break_point++;
//             while(break_point<i) {
//                 int temp = nums[break_point];
//                 nums[break_point] = nums[i];
//                 nums[i] = temp;
//                 break_point++;
//                 i--;
//             }
//         }
        
//     }
// }





class Solution{
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int piv=-1;

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }

        if(piv!=-1){
            for(int i=n-1;i>piv;i--){
                if(nums[i]>nums[piv]){
                    int temp=nums[piv];
                    nums[piv]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
        }
        reverse(nums,piv+1,n-1);
    }
    private static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            
        }
    }
}
