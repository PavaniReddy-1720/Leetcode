//this is with extra array
class Solution {
    public int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        return temp;
    }
}
//this is without extra array   ------> Using TWO POINTER approach
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left=0,right=arr.length-1;
        
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
