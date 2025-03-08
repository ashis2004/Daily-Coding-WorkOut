//brute force
import java.util.*;

class Solution {
  public int maxArea(int[] height) {

    int right =height.length-1,left=0, maxArea=0;

    while(left<=right){
        int ht=Math.min(height[left],height[right]);
        int wd=right-left;
        int area=ht*wd;

        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
        maxArea=Math.max(maxArea,area);


    }
    return maxArea;
  }
}