class Solution {
    public int fib(int n) {
        int pre=0;
        int current = 1;
        int next=0;
        for(int i=0; i<n; i++){
            next = pre + current;
            pre=current;
            current = next;
        }
        return pre;
    }
}