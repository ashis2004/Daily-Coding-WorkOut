class Solution {
    public String frequencySort(String s) {
        // 1. Count character frequencies using a HashMap
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // 'Char' should be 'char'
            map.put(ch, map.getOrDefault(ch, 0) + 1); // More concise way to update count
        }

        // 2. Get all unique characters and sort them by frequency
        List<Character> chars = new ArrayList<>(map.keySet());

        // Sort in descending order of frequency.
        // If frequencies are equal, the order doesn't matter for this problem,
        // but a stable sort or secondary criteria could be added if needed.
        // (a, b) -> map.get(b) - map.get(a) for descending order
        Collections.sort(chars, (a, b) -> map.get(b).compareTo(map.get(a))); // Correct lambda for sorting

        // 3. Build the result string
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            int frequency = map.get(ch);
            for (int i = 0; i < frequency; i++) { // Correct loop to append character 'frequency' times
                sb.append(ch);
            }
        }
        return sb.toString(); // Don't forget to return the result!
    }
}