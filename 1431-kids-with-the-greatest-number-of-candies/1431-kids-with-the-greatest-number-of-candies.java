class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Math.max(candies);
        int size=Math.size(candies);
        Boolean TrackCandies=new boolean[size];
        for (int i=0;i<size;i++){
            if(candies[i]+extraCandies>=max){
                TrackCandies[i]=true;
            }
            else{
                TrackCandies[i]=false;
            }
        }
        return TrackCandies; 
    }
}