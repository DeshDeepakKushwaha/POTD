class Solution {
    public boolean isPossible(int arr[],int k,int mid){
        int s=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(s+arr[i]<=mid){
                s+=arr[i];
            }else{
                c++;
                s=arr[i];
            }
        }
        return c<=k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low=-1;
        int high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(arr,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
