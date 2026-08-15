class Solution {
    public int missingNumber(int[] nums) {
        int target = 0;
        int low = 0;
        int high = nums.length-1;
        Arrays.sort(nums);
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                target++;
                low=0;
                high = nums.length-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
               high=mid-1;
            }
        }
        return target;
    }
}