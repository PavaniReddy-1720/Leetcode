class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int size=nums.length;
        int product=1;
        int arr1[]=new int[size];
        
        for(int i=0;i<size;i++){

            for(int j=0;j<size;j++){
                if(i!=j){
                    product=product*nums[j];
                }
            arr1[i]=product;
        
            }
            product=1;
        }
        return arr1;
    }
}