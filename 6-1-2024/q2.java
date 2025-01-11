class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}
