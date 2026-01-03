import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // 1. Find maximum candies
        int max = candies[0];
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        // 2. Result list
        List<Boolean> result = new ArrayList<>();

        // 3. Check each kid
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
