class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase().replace(" ","");
        t=t.toLowerCase().replace(" ","");

        if (s.length()!=t.length())
            return false;
        
        //create a bucket array to store final count of each char individually
        int [] count=new int[26];

        //for string1 ->count increment
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        /**
            s.charAt(i) - 'a'
→ converts the character to a number between 0 and 25, representing its position in the alphabet.
    since a=97 after this a=0 */

        //for string2 ->count decrement

        for(int i=0;i<t.length();i++){
            count[t.charAt(i)-'a']--;
        }

        //checking if all buckets are empty
        for(int num: count){
            if(num!=0)
                return false;
        }
    return true;
    }
}