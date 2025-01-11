class Solution {

    int minDay(int []weights,int cap){
        int sum=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>cap){
                sum=weights[i];
                days++;
            }else{
                sum+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(minDay(weights,mid)<=days){
               
                 high=mid-1; 
            }else{
              low=mid+1;
            }
        }
        return low;
    }
}