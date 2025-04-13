import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        //Brute force solution 
        // List<Integer> positiveList = new ArrayList<>();
        // List<Integer> negativeList = new ArrayList<>();

        // for(int i = 0 ;i < nums.length ; i++){
        //     if(nums[i] > 0){
        //         positiveList.add(nums[i]);
        //     }else{
        //         negativeList.add(nums[i]);
        //     }
        // }

        // for(int i = 0 ; i < nums.length/2 ; i++){
        //     nums[2*i] = positiveList.get(i);
        //     nums[2*i+1] = negativeList.get(i);
        // }

        // return nums;
        
        //Optimal approach 
        int positiveIndex = 0;
        int negativeIndex = 1;
        int newArray[] = new int[nums.length];

        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] < 0 ){
                newArray[negativeIndex] = nums[i];
                negativeIndex += 2;
            }else{
                newArray[positiveIndex] = nums[i];
                positiveIndex += 2;
            }
        }

        return newArray;
    }
}