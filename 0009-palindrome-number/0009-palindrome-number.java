class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int digit = 0;
        int original = x;
        while(x>0){
            digit = x%10;
            rev = rev * 10 + digit;
            x/=10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }
}