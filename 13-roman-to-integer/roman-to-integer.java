class Solution {
    // Function to convert a Roman numeral string to an integer
    public int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Convert the input string to an array of characters
        char chars[] = s.toCharArray();

        // Initialize the result variable to store the final integer value
        int result = 0;

        // Iterate through the characters of the input string
        int i, j;
        for (i = 0, j = 1; j < chars.length; i++, j++) {
            // Check if the current Roman numeral is greater than or equal to the next one
            if (map.get(chars[i]) >= map.get(chars[j])) {
                // If true, add the value of the current Roman numeral to the result
                result += map.get(chars[i]);
            } else {
                // If false, subtract the value of the current Roman numeral from the result
                result -= map.get(chars[i]);
            }
        }

        // Add the value of the last Roman numeral to the result
        result += map.get(chars[i]);

        // Return the final integer result
        return result;
    }
}
