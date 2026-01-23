import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        Deque<Long> stack = new ArrayDeque<>();
        int operations = 0;

        for (int x : nums) {
            long current = x;

            // Merge while order is decreasing
            while (!stack.isEmpty() && stack.peekLast() > current) {
                current += stack.pollLast();
                operations++;
            }

            stack.addLast(current);
        }

        return operations;
    }
}
