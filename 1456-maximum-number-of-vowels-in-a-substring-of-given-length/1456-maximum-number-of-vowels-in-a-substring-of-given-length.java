class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j<s.length()){
            if(isVowel(s.charAt(j))){
                count++;
            }
            if(j-i+1==k){
                max =  Math.max(max, count);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return max;
    }
}