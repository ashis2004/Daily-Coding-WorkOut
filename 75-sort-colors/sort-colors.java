class Solution {
    public void sortColors(int[] nums) {
        int z=0, o=0, t=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) o++;
            else t++;

        }
        int ind=0;
        for(int i=0;i<z;i++){
            nums[ind++]=0;
        }
        for(int i=0;i<o;i++){
            nums[ind++]=1;
        }
        for(int i=0;i<t;i++){
            nums[ind++]=2;
        }
    //     int start=0;
    //     int end=nums.length-1;
    //     int i=0; //used to iterate nums array

    //     while(i<=end){
    //         if(nums[i]==0){
    //             swap(nums,i,start);
    //             i++;
    //             start++;
    //         }
    //         else if(nums[i]==2){
    //             swap(nums,i,end);
    //             end--;
    //         }
    //         else{
    //             i++;
    //         }
    //     }
       


    // }
    // public static void swap(int nums[],int num1, int num2){
    //     int temp=nums[num1];
    //     nums[num1]=nums[num2];
    //     nums[num2]=temp;
    }
}