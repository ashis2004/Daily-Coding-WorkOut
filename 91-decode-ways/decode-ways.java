class Solution {
    public int numDecodings(String s) {
        // Check if the input string is empty or starts with '0'
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        // If the string has only one character, there is only one decoding
        if (s.length() == 1) {
            return 1;
        }

        // Initialize variables to keep track of counts
        int count1 = 1; // Count for the single character
        int count2 = 1; // Count for two characters combined

        // Loop through the string starting from the second character
        for (int i = 1; i < s.length(); ++i) {
            int d = s.charAt(i) - '0'; // Current digit
            int dd = (s.charAt(i - 1) - '0') * 10 + d; // Two-digit number

            int currentCount = 0;

            // If the current digit is greater than 0, it can be decoded independently
            if (d > 0) {
                currentCount += count2;
            }

            // If the two-digit number is between 10 and 26, it can be decoded together
            if (dd >= 10 && dd <= 26) {
                currentCount += count1;
            }

            // Update counts for the next iteration
            count1 = count2;
            count2 = currentCount;
        }

        // The final count represents the total number of decodings
        return count2;
    }
}
