
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(k, n, 1, cur, ans);
        return ans;
    }

    private void backtrack(int k, int n, int start, List<Integer> cur, List<List<Integer>> ans) {
        if (cur.size() == k && n == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        if (cur.size() > k || n < 0) {
            return;
        }
        
        for (int i = start; i <= 9; i++) {
            cur.add(i);
            backtrack(k, n - i, i + 1, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }
}
