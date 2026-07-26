class Solution {
    public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> sumFreq = new HashMap<>();
    sumFreq.put(0, 1);

    int count = 0;
    int prefixSum = 0;

    for (int num : nums) {
        prefixSum += num;
        count += sumFreq.getOrDefault(prefixSum - k, 0);
        sumFreq.put(prefixSum, sumFreq.getOrDefault(prefixSum, 0) + 1);
    }

    return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna