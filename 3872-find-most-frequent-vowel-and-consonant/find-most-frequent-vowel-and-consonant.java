class Solution {
    public int maxFreqSum(String s) {
       int maxc=0,maxv=0;
       HashMap<Character,Integer>mp=new HashMap<>();
       for(char c:s.toCharArray()){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            mp.put(c,mp.getOrDefault(c,0)+1);
            maxv=Math.max(maxv,mp.get(c));
        }
        else{
            mp.put(c,mp.getOrDefault(c,0)+1);
            maxc=Math.max(maxc,mp.get(c));
        }
       }
       return maxc+maxv;
    }
}