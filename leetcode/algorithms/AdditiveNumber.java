/*
 * Additive number is a positive integer whose digits 
 * can form additive sequence.

 * A valid additive sequence should contain at least 
 * three numbers. Except for the first two numbers, 
 * each subsequent number in the sequence must be the 
 * sum of the preceding two.
 * 
 * For example:
 * "112358" is an additive number because the digits 
 * can form an additive sequence: 1, 1, 2, 3, 5, 8.
 * 
 * 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 * "199100199" is also an additive number, the 
 * additive sequence is: 1, 99, 100, 199.
 * 1 + 99 = 100, 99 + 100 = 199
 * Note: Numbers in the additive sequence cannot have 
 * leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is 
 * invalid.
 * 
 * Given a string represents an integer, write a function 
 * to determine if it's an additive number.
 * 
 * Follow up:
 * How would you handle overflow for very large input 
 * integers?
 */
public class AdditiveNumber {

    public boolean isAdditiveNumber(String num) {

    }

    public boolean dfs(int sum, String num) {
        if (num.length() <= 10 && Long.parseLong(num) == (long) sum)
            return true;
        for (int i = 1; i <= 10 && i <= num.length(); ++i) {
            sum += Integer.parseInt(num.substring(0, i));
            dfs(sum, num.substring(i));
            // sum -= Integer.pareseInt(num.substring(0, i));
        }
    }

}
