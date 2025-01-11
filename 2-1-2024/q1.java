class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int maxRows[]=new int[n];
        int maxCols[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 maxRows[i] = Math.max(maxRows[i], grid[i][j]);
                 maxCols[j] = Math.max(maxCols[j], grid[i][j]);
            }
        }

        int sum=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int min=Math.min(maxRows[i],maxCols[j]);
                sum+=(min-grid[i][j]);
            }
        }
        return sum;
    }
}