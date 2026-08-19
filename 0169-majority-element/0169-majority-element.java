class Solution {
    public int majorityElement(int[] nums) {

// Boyer-Moore Voting Algorithm ek simple algorithm hai jo Majority Element (LeetCode 169) find karne ke liye use hota hai.

// Majority Element kya hai?

// Array me jo element n/2 se zyada baar aaye, wahi majority element hai.

// Example:

// nums = [2, 2, 1, 1, 1, 2, 2]

// Array size = 7

// 7/2 = 3

// 2 → 4 times aaya → Majority Element = 2

        int candidate = 0;
        int count = 0;

        for(int num : nums){
            if (count == 0){
                candidate = num;
            }
            if (candidate == num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}