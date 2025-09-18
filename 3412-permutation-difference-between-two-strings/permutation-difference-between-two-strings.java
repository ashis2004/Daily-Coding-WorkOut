class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(s.charAt(i)==t.charAt(j)) ans+=Math.abs(i-j);
            }
        }
        return ans;
        
    }
}