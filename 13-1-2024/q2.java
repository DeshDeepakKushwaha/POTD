class Solution {
    
    public static int noOfGasStations(int stations[],double dist){
        int c=0;
        for(int i=0;i<stations.length-1;i++){
            int no=(int)((stations[i+1]-stations[i])/dist);
            if(no*dist==(stations[i+1]-stations[i])){
                no=no-1;
            }
            c+=no;
        }
        return c;
    }
  
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n=stations.length;
        double low=0;
        double high=0;
        
        for(int i=0;i<n-1;i++){
            high=Math.max(high,(double)(stations[i + 1] - stations[i]));
        }
        
        double diff = 1e-6 ;
        while(high-low>diff){
            double mid=low+(high-low)/2;
            int c=noOfGasStations(stations,mid);
            if(c>k){
                low=mid;
            }else{
                high=mid;
            }
        }
        return high;
    }
}
