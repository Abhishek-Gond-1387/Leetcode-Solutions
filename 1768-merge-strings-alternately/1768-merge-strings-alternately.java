class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int j = 0;
        int k = 0;
        while (j < word1.length() || k < word2.length()) {
            if (j < word1.length()) {
                result += word1.charAt(j);
                j++;
            }
            if (k < word2.length()) {
                result += word2.charAt(k);
                k++;
            }
        }
        return result;
    }
}