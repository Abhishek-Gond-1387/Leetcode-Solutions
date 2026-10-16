class Solution {
    public int[] sortArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public int[] helper(int[] arr, int start, int end) {
        if (start >= end) {
            return start == end ? new int[] { arr[start] } : new int[0];
        }

        int mid = start + (end - start) / 2;
        int[] left = helper(arr, start, mid);
        int[] right = helper(arr, mid + 1, end);

        return merge(left, right);
    }
    public int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sorted[k++] = left[i++];
            } else {
                sorted[k++] = right[j++];
            }
        }
        while (i < left.length) {
            sorted[k++] = left[i++];
        }
        while (j < right.length) {
            sorted[k++] = right[j++];
        }
        return sorted;
    }
}