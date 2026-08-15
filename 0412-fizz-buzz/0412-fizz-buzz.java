class Solution {
    public List<String> fizzBuzz(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        List<String> li = new ArrayList<>();
        for (int num : nums) {
            if (num % 3 == 0 && num % 5 == 0) {
                li.add("FizzBuzz");
            } else if (num % 3 == 0) {
                li.add("Fizz");
            } else if (num % 5 == 0) {
                li.add("Buzz");
            } else {
                li.add(String.valueOf(num));
            }
        }
        return li;
    }
}