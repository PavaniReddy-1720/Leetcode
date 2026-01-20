class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int p = nums.get(i);

            // If even (only possible even prime is 2), no solution
            if (p % 2 == 0) {
                ans[i] = -1;
                continue;
            }

            int t = p + 1;
            int lowestPower = t & (-t);   // lowest power of 2 in (p+1)

            ans[i] = p - (lowestPower / 2);
        }

        return ans;
    }
}
