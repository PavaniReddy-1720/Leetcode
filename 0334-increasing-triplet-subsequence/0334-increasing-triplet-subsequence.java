class Solution {
    public boolean increasingTriplet(int[] nums) {
        for(int i=2;i<nums.length;i++){
            if (nums[i-2]<nums[i-1]){
                if(nums[i-1]<nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
