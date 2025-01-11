class Solution {
    public static boolean isPossible(int arr[],int k,int pages){
        int s=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(s+arr[i]<=pages){
                s+=arr[i];
            }else{
                c++;
                s=arr[i];
            }
        }
        return c<=k;
    }
    public static int findPages(int[] arr, int k) {
        if(k>arr.length){
            return -1;
        }
        // code here
        int low=-1;
        int high=0;
        for(int i=0;i<arr.length;i++){
            high+=arr[i];
            low=Math.max(low,arr[i]);
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