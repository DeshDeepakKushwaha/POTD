class Solution {
    public boolean lowerBound(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

       if(ans==n){
        return false;
       }
       return (arr[ans]==x);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            if(lowerBound(matrix[i],c,target)) return true;
        }
        return false;
    }
}