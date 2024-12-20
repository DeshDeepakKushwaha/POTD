class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
           int c1=s.charAt(i);
           int c2=s.charAt(i+1);
           sum=sum+Math.abs(c2-c1);
        }
        return sum;
    }
}