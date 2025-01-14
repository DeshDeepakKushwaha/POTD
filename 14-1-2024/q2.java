class Solution {
    int upperBound(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high+1;
    }
    int countSmaller(int mat[][],int n,int m,int mid){
        int c=0;
        for(int i=0;i<n;i++){
            c+=upperBound(mat[i],mid);
        }
        return c;
    }
    int median(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
        }
        int med=(m*n)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int x=countSmaller(mat,n,m,mid);
            if(x<=med){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}