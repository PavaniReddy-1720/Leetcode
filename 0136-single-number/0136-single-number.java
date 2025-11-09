/**
Hi Pavani
this code applies only when numbers repeat twice and thrice 
since XOR cancels out if two numbera are same X^X=0
 
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
        
    }
}

BRUTEFORCE APPROACH
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true; // assume nums[i] is unique

            for (int j = 0; j < nums.length; j++) { // j starts from 0 (correct)
                if (i != j && nums[i] == nums[j]) { // skip same index
                    isUnique = false;
                    break; // no need to check further
                }
            }

            // If array has only one element, return it directly
            if (nums.length == 1) {
                return nums[i];
            }
            // If current number is unique, return it
            else if (isUnique) {
                return nums[i];
            }
        }

        // if nothing found (shouldn't happen for valid input)
        return -1;
    }
*/
    