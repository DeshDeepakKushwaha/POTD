class Solution {
    public int minimumMoves(String s) {
        int c=0;
        int i=0;
        int n=s.length();
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='X'){
                c++;
                i=i+3;
            }else{
                i++;
            }
        }
        return c;
    }
}