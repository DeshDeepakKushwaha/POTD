class Solution {
    public int searchInsert(int[] nums, int x) {
        
int n=nums.length;
         int ans=n;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=x) {
                ans=mid;
                right=mid-1;
            }else left=mid+1;
        }
        return ans;
    }
}