class Solution{
    public int longestConsecutive(int nums[]){

        Set<Integer>st=new HashSet<Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            int cnt=1;
            int num=nums[i];
            while(st.contains(--num)){
                cnt++;
                st.remove(num);

            }
        
            //int cnt=1;
            num=nums[i];
            while(st.contains(++num)){
                cnt++;
                st.remove(num);

            }
            max=Math.max(max,cnt);

        }
        return max;
    }
}