class Solution {
    int max;
    String ans;

    public String largestTimeFromDigits(int[] arr) {
        max = -1; 
        ans = "";
        boolean[] used = new boolean[4]; 
        solve(arr, new StringBuilder(), used);
        
        if (!ans.equals("")) {
            ans = ans.substring(0, 2) + ":" + ans.substring(2, 4);
        }
        return ans;
    }

    private void solve(int[] arr, StringBuilder curr, boolean[] used) {
        if (curr.length() == 4) {
            int hours = Integer.parseInt(curr.substring(0, 2));
            int minutes = Integer.parseInt(curr.substring(2, 4));

            if (hours < 24 && minutes < 60) {
                int totalMinutes = hours * 60 + minutes; 
                if (totalMinutes > max) {
                    max = totalMinutes;
                    ans = curr.toString();  
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (!used[i]) {
                used[i] = true;
                curr.append(arr[i]);
                solve(arr, curr, used);
                curr.deleteCharAt(curr.length() - 1); 
                used[i] = false;
            }
        }
    }
}