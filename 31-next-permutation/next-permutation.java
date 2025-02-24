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
        int n = nums.length;
        int pivot = -1;
        
        // Step 1: Find the pivot (rightmost index where nums[i] < nums[i+1])
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If a pivot exists, find the rightmost element larger than pivot
        if (pivot != -1) {
            for (int j = n - 1; j > pivot; j--) {
                if (nums[j] > nums[pivot]) {
                    swap(nums, pivot, j);
                    break;
                }
            }
        }
        
        // Step 3: Reverse the part from pivot+1 to end
        reverse(nums, pivot + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // Output: [1, 3, 2]
    }
}
