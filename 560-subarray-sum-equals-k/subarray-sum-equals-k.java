class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int s=0,cnt=0;

        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(hm.containsKey(s-k)) cnt+=hm.get(s-k);

            hm.put(s,hm.getOrDefault(s,0)+1);

        }
        return cnt;
        
    }
}