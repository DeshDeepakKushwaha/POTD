class Solution {
    public int isPossible(int n,int mid,int m){
            long ans=1;
            for(int i=1;i<=n;i++){
                ans*=mid;
                if(ans>m) return 2;
            }
            if(ans==m) return 1;
            return 0;
        }
    public int nthRoot(int n, int m) {
        // code here
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(n,mid,m)==1) return mid;
            else if(isPossible(n,mid,m)==0){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}