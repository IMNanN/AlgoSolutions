/*
Given a string, determine if it is a palindrome, considering only alphanumeric 
characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to 
ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isLetter(s.charAt(i))) {
                i++;
            } else if (!isLetter(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j) + 32 && s.charAt(i) != s.charAt(j) - 32) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isLetter(char c ) {
        return 'A' <= c && c <= 'Z' || 'a' <= c && c <= 'z';
    }

}
