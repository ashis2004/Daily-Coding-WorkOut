import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character is already in the map, move the left pointer to avoid repetition
            if (mp.containsKey(c)) {
                left = Math.max(left, mp.get(c) + 1);
            }

            // Store the latest index of the character
            mp.put(c, right);
            
            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
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


