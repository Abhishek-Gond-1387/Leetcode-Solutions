class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double max = 0;
        double sum = 0;
        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        double avg = sum/k;
        max = avg;
        for(int i = k; i<nums.length; i++){
            sum+=nums[i]-nums[left++];
            avg = sum/k;
            if(avg>max){
                max = avg;
            }
        }
        return max;
    }
}