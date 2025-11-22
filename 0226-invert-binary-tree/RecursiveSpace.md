General Rule

Whenever recursion is used, the space complexity is at least O(depth of recursion) because each function call is stored in the call stack.

So:

Space Complexity of Recursion = Space used by call stack + space used inside function

📌 If the function does NOT use extra data structures

(e.g., no array copies, no additional large variables)

Then:

👉 Space Complexity = O(height of recursion tree)
which is usually:

O(n) for linear recursion (like factorial, Fibonacci without DP)

O(log n) for divide-and-conquer balanced recursion (like binary search)

O(h) for tree recursion where h = height of tree
