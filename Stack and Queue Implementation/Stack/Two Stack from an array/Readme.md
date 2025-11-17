https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
HOW IT WORKS
Stack 1:
grows from left → right
starts at top1 = -1

Stack 2:
grows from right → left
starts at top2 = size
They grow towards each other.

We check for space using:
if (top1 + 1 < top2)

This ensures they never collide.
