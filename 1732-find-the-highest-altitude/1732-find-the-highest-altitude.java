class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int maxAlt = 0;

        for (int g : gain) {
            curr += g;
            if (curr > maxAlt) {
                maxAlt = curr;
            }
        }
        return maxAlt;
    }
}
