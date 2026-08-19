class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String s : sentences){
            int count = s.split(" ").length;
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}