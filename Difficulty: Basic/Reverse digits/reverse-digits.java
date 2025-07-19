// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int reversed = 0;
        // Code here
        while(n > 0){
            int digit;
            digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}