class Solution {
    public String reverse(String []words){
        int low=0;
        int high=words.length-1;
        while(low<high){
            String temp=words[low];
            words[low]=words[high];
            words[high]=temp;
            low++;
            high--;
        }
        return String.join(" ",words);
    }
    public String reverseWords(String s) {
        s = s.trim();
        String words[]=s.split("\\s+");
        return reverse(words);
    }
}