/**
Hi Pavani
this code applies only when numbers repeat twice and thrice 
since XOR cancels out if two numbera are same X^X=0
 */
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
        
    }
}
