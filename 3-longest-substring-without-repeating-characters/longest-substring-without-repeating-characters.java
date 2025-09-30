import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int m=0;
       HashMap<Character,Integer>hm=new HashMap<>();
       for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))){
            l=Math.max(hm.get(s.charAt(i))+1,l);


        }
        hm.put(s.charAt(i),i);
        m=Math.max(m,i-l+1);
       }
       return m;

    }
}



        // HashSet<Character>w=new HashSet<>();
        // while(right<s.length()){
        //     char c=s.charAt(right);
        //     if(!w.contains(c)){
        //         w.add(c);
        //         maxLen=Math.max(maxLen,w.size());
        //         right++;
        //     }
        //     else{
        //         w.remove(s.charAt(left));
        //         left++;
        //     }
            
        // }
        // return maxLen;
        
        // Set<Character>st=new HashSet<>();
        
        // for(int i=0;i<s.length();i++){
        //     if(!st.contains(s.charAt(i))){
        //         st.add(s.charAt(i));
        //         maxLen=Math.max(maxLen,i-left+1);
        //     }
        //     else{
        //         while(s.charAt(left)!=s.charAt(i)){
        //             st.remove(s.charAt(left));
        //             left++;
        //         }
        //         st.remove(s.charAt(left));left++;
        //         st.add(s.charAt(i));
        //     }
        // }
        // return maxLen;
    






// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0;
//         int maxLength = 0;
//         HashSet<Character> charSet = new HashSet<>();

//         for (int right = 0; right < s.length(); right++) {
//             while (charSet.contains(s.charAt(right))) {
//                 charSet.remove(s.charAt(left));
//                 left++;
//             }

//             charSet.add(s.charAt(right));
//             maxLength = Math.max(maxLength, right - left + 1);
//         }

//         return maxLength;       
//     }
// }



// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         Set<Character> charSet = new HashSet<>();
//         int left = 0;
        
//         for (int right = 0; right < n; right++) {
//             if (!charSet.contains(s.charAt(right))) {
//                 charSet.add(s.charAt(right));
//                 maxLength = Math.max(maxLength, right - left + 1);
//             } else {
//                 while (charSet.contains(s.charAt(right))) {
//                     charSet.remove(s.charAt(left));
//                     left++;
//                 }
//                 charSet.add(s.charAt(right));
//             }
//         }
        
//         return maxLength;
//     }
// }


// import java.util.HashMap;

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashMap<Character, Integer> seen = new HashMap<>();
//         int i = 0, res = 0;

//         for (int j = 0; j < s.length(); j++) {
//             char currentChar = s.charAt(j);
//             if (seen.containsKey(currentChar)) {
//                 i = Math.max(i, seen.get(currentChar) + 1);
//             }
//             seen.put(currentChar, j);
//             res = Math.max(res, j - i + 1);
//         }

//         return res;
//     }
// }


