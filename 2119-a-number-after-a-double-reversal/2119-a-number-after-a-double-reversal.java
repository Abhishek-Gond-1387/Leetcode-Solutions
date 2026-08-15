class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;
        int rev = 0;
        int digit = 0;
        int num2 = 0;
        while(num > 0){
            digit = num%10;
            rev = rev * 10 + digit;
            num/=10;
            num2 = num;
        }
        int rev2 = 0;
        while(rev > 0){
            digit = rev%10;
            rev2 = rev2 * 10 + digit;
            rev/=10;
        }
        if(original==rev2){
            return true;
        }
        else{
            return false;
        }
    }
}