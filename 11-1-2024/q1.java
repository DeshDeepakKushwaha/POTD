class Solution {
    public int sumK(int [] piles,int div){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=Math.ceil((double) piles[i] / div);
         }
         return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();

        while(low<=high){
           int mid = low + (high - low) / 2;

            if(sumK(piles,mid)<=h){
              high=mid-1;
            }else{
              low=mid+1;
            }
        }
        return low;
    }
}