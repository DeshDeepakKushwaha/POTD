class Solution {
    public static boolean isPossible(int []stalls,int k,int dist){
        int c=1;
        int last=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last>=dist){
                c++;
                last=stalls[i];
            }
        }
        return c>=k;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int low=1;
        Arrays.sort(stalls);
        int high=stalls[stalls.length-1];
        
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(stalls,k,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}