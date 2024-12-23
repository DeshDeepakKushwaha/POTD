class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int bucket[]=new int[102];
        for(int i=0;i<n;i++){
            bucket[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            bucket[i+1]+=bucket[i];
        }
        for(int i=0;i<n;i++){
        nums[i] = nums[i] == 0 ? 0 : bucket[nums[i] - 1];
        }
        return nums;
    }
}