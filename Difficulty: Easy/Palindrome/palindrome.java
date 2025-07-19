class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if(original == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}