import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
//         char[] sChars = s.toCharArray();
//         char[] tChars = t.toCharArray();
        
//         Arrays.sort(sChars);
//         Arrays.sort(tChars);
        
//         return Arrays.equals(sChars, tChars);
        
        int [] tt=new int[26];

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            tt[s.charAt(i)-'a']++;
            tt[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(tt[i]!=0){
                return false;
            }
        }
        return true;
    }
}

