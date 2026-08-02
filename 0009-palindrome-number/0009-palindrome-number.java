class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        // Numbers ending with 0 (except 0 itself) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }
}