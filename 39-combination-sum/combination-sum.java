class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        back(candidates,target,0,cur,ans);
        return ans;
        
        
        
    }
    void back(int[] candidates, int target,int s,List<Integer>cur,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=s;i<candidates.length;i++){
            cur.add(candidates[i]);
            back(candidates,target-candidates[i],i,cur,ans);
            cur.remove(cur.size()-1);
            
        }
    }
    
}