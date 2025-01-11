class Solution {
 
    public int minPartitions(String s) {
       int max=-1;
       int n=s.length();
       for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'0';
            max=Math.max(max,ch);
       }
       return max;
    }
}