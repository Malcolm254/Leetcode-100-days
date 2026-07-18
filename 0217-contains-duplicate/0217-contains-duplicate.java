class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
      for (int num : nums) {
         if (!seen.add(num)) {
            return true;
         }
    }
    return false;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna