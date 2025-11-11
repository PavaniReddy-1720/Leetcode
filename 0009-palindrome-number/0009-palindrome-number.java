class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reversed=0;
        if (x<0) return false;
        while(x>0){
            int digit=x%10;
            reversed=reversed*10+ digit;
            x=x/10;
        }
        return original==reversed;
    }
}
/**


So you want to treat negative numbers as positive — meaning if the number is -121, we check it like 121 (✅ palindrome).
than it is
    n = Math.abs(n); // \U0001f448 convert to positive number


class Solution {
    boolean isPalindrome(int n) {
        n = Math.abs(n); // \U0001f448 convert to positive number

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;             // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            n = n / 10;                     // remove last digit
        }

        return original == reversed;
    }
}
 */