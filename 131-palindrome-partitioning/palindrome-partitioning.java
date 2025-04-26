import java.util.*;

public class Solution {
    public List<List<String>> partition(String s) {
        List<String> cur = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        back(s, 0, cur, ans);
        return ans;
    }

    void back(String s, int ind, List<String> cur, List<List<String>> ans) {
        if (ind == s.length()) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isPalin(s, ind, i)) {
                cur.add(s.substring(ind, i + 1));
                back(s, i + 1, cur, ans);  // move to next index after i
                cur.remove(cur.size() - 1);
            }
        }
    }

    boolean isPalin(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
