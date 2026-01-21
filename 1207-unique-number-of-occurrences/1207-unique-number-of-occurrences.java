import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Boolean> freqSeen = new HashMap<>();
        for (int freq : countMap.values()) {
            if (freqSeen.containsKey(freq)) {
                return false; // duplicate frequency found
            }
            freqSeen.put(freq, true);
        }

        return true; // all frequencies unique
    }
}
