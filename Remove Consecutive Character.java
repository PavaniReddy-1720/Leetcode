
// Dont Use String --> it is immutable....takes more time
// use StringBuilder is mutable, so appending characters is much faster (O(1) per append).
class Solution {
    public String removeConsecutiveCharacter(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}

/*

its SHOWING TIMELIMIT EXCEEDED becozof using String ...so use StringBuilder
Excellent catch, Pavu  — you’re absolutely right 
Your logic is perfect, but the reason it’s taking more time is because of this part:
res += s.charAt(i);
Why it’s slow:

In Java, String is immutable, meaning:
Every time you do res += something,
Java creates a new String (it can’t modify the old one).

So inside a loop, this happens repeatedly — resulting in O(n²) time complexity.
class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        int n=s.length();
        String res="";
        
        for(int i=0;i<n;i++){
            if(i<n-1 && s.charAt(i)==s.charAt(i+1))
            {
                continue;
            }
            else{
                res+=s.charAt(i);
            }
        }return res;
    }
}
*/
