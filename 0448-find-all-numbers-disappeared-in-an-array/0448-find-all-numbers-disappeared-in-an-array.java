class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> ans = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // for(int i = 1; i<=nums.length; i++){
        //     if (!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
         int x =  1;
         for (int i = 0; i < nums.length; i++) {
           
            if (!set.contains(x)) {
                ans.add(x);}
                x++;
            
        }

        return ans;
    }
}