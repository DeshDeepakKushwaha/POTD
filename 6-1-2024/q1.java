class Solution {
    public int iterative(int []nums,int left,int right,int target){
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

    public int recursive(int nums[],int left,int right,int target){
        if(left>right) return -1;

        int mid=left+(right-left)/2;

        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return recursive(nums,left,mid-1,target);
        return recursive(nums,mid+1,right,target);
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        
        // return iterative(nums,left,right,target);
        return recursive(nums,left,right,target);
    }
}