class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        // Sum of first k elements
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        double maxSum = windowSum;
        
        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i];       // add new element
            windowSum -= nums[i - k];   // remove old element
            maxSum = Math.max(maxSum, windowSum);
        }
        
        return maxSum / k;
    }
}
