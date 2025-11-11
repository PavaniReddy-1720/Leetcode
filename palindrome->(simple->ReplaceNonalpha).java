class Solution {
    boolean isPalindrome(String s) {
        // code here
        
        /*The pattern [^a-zA-Z] is part of a regular expression (regex) — it’s called a character class with negation.
        [^a-zA-Z] means
        ^->means not this
        “Match any character that is not a letter (not between a–z or A–Z).”
        */
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left=0,right=s.length()-1;
        
        while(left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
