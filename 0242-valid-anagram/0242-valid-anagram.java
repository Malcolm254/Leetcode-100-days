class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
           int[] count = new int[26];
         for (char c : s.toCharArray()) {
           count[c - 'a']++;
         }
         for (char c : t.toCharArray()) {
           count[c - 'a']--;
         if (count[c - 'a'] < 0) return false;
    }
    return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna