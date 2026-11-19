
/*
 * Problem: Valid Palindrome
 * LeetCode: 125
 * Pattern: Two Pointers
 * Difficulty: Easy
 *
 * Approach:
 * Use two pointers, one starting from the beginning
 * and the other from the end.
 * Skip non-alphanumeric characters and compare
 * characters without considering case.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            int left = s.charAt(i);
            int right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
            } 
            else if (!Character.isLetterOrDigit(right)) {
                j--;
            } 
            else {
                if (Character.toLowerCase(left) !=
                    Character.toLowerCase(right)) {
                    return false;
                }

                i++;
                j--;
            }
        }

        return true;
    }
}
