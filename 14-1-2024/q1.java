class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
       
        int i=0,j=0;
        int k=0;
    
        double median=-1;
        if((m+n)%2==0){
            int t=n/2;
            int ind1=-1,ind2=-1,el1=-1,el2=-1;
                while(i<m && j<n){
                    if(nums1[i]<nums2[j]){
                        i++;
                    }else{
                        j++;
                    }
                    if(c==t-1){
                        el1=nums
                    }
                }
                while(i<m){
                    nums[k]=nums1[i];
                    i++;
                    k++;
                }
                while(j<n){
                    nums[k]=nums2[j];
                    j++;
                    k++;
                }
            int t=(m+n)/2;
            median=(nums[t-1]+nums[t])/2.0;
        }else{
            int t=(m+n)/2;
            median=nums[t];
        }
        return median;
    }
}