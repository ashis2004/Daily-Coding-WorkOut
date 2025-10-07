import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int frq[]=new int[26];
        for(char c:s.toCharArray()){
            frq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            frq[c-'a']--;
        }
        for(int ct:frq){
            if(ct!=0) return false;
        }
        return true;

    }
}

