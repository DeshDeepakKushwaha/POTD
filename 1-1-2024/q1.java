class Solution {
    public int countDivisors(int n){
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(n/i!=i){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean isThree(int n) {
        if(3==countDivisors(n)) return true;
        else return false;
    }

}