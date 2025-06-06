class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        back(candidates,0,target,ans,new ArrayList<>());
        return ans;
       
    }   
    private void back(int[] candidates,int s,int target,List<List<Integer>>ans,List<Integer>temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));

            return;
        }
        
        for(int i=s;i<candidates.length;i++){
            if(i!=s&&candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            back(candidates,i+1,target-candidates[i],ans,temp);
            temp.remove(temp.size()-1);
            
        }

    } 
}