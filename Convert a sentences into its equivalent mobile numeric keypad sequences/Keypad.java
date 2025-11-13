// User function Template for Java
class Solution {
    String printSequence(String S) {
        // code here
        String[] keys={
            "2","22","222", //A,B,C
            "3","33","333", //D,E,F
            "4","44","444", //G,H,I
            "5","55","555", //J,K,L
            "6","66","666", //M,N,O
            "7","77","777","7777",  //P,Q,R,S
            "8","88","888", //T,U,V
            "9","99","999","9999"   //W,X,Y,Z
        };
        
        StringBuilder sb=new StringBuilder();
        S=S.toUpperCase();
        
        for(char ch:S.toCharArray()){
            if(ch==' '){
                sb.append('0');
                //sb.append('0 ');
            }else if(ch>='A' && ch<='Z'){
                sb.append(keys[ch-'A']);
                //or ab.append(keys[ch-'A  ']);
            }
        }
        return sb.toString();
        //return sb.toString().trim();->just wanted to tell u u can remove off
        //last space using trim() method
        
    }
}
