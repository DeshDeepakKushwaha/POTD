class Solution {
    public static int gcd(int a, int b) {
        // code here
       if(a==0) return b;
       return gcd(b%a,a);
    }
}
     
