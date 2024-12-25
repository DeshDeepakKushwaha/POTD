class Solution {
    public int trailingZeroes(int n) {
        int countOfFive=0;
        while(n!=0){
            countOfFive+=n/5;
            n=n/5;
        }
        return countOfFive;
    }
}