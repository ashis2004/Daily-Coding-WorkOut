class Solution {
    public int longestSubstring(String s, int k) {
        int left, maxLen=0;

        // HashMap<Character,Integer>mp=new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     map.put(c,mp.getOrDefault(c,1)+1);
        // }
        int n=s.length();
        int []c=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(c[s.charAt(i)-'a']<k){
                int l=longestSubstring(s.substring(0,i),k);
                int r=longestSubstring(s.substring(i+1),k);
                return Math.max(l,r);
            }
        }
        return n;

        
    }
}