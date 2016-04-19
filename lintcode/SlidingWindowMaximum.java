/*
 * Given an array of n integer with duplicate number, and a moving 
 * window(size k), move the window at each iteration from the start 
 * of the array, find the maximum number inside the window at each 
 * moving.

Example
For array [1, 2, 7, 7, 8], moving window size k = 3. return [7, 7, 8]

At first the window is at the start of the array like this

[|1, 2, 7| ,7, 8] , return the maximum 7;

then the window move one step forward.

[1, |2, 7 ,7|, 8], return the maximum 7;

then the window move one step forward again.

[1, 2, |7, 7, 8|], return the maximum 8;

Challenge 
o(n) time and O(k) memory
 */
public class SlidingWindowMaximum {

    /**
     * @param nums: A list of integers.
     * @return: The maximum number inside the window at each moving.
     */
    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums, ++i) {
            if (i < k) {

            } else {

            }
        }
    }

}