class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code 
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platformNeeded=0;
        int maxPlatform=0;
        int i=0,j=0,n=arr.length;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                platformNeeded++;
            }else{
                j++;
                platformNeeded--;
            }
            maxPlatform=Math.max(maxPlatform,platformNeeded);
        }
        return maxPlatform;
    }
}
