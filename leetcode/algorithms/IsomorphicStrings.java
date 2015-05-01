/*
 * Given two strings s and t, determine 
 * if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in 
 * s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced 
 * with another character while preserving the 
 * order of characters. No two characters may map 
 * to the same character but a character may map 
 * to itself.
 * 
 * For example,
 * Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 *
 * Note:
 * You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> map1 = new LinkedHashMap<Character, List<Integer>>();
        Map<Character, List<Integer>> map2 = new LinkedHashMap<Character, List<Integer>>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                map1.get(s.charAt(i)).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map1.put(s.charAt(i), list);
            }
            if (map2.containsKey(t.charAt(i))) {
                map2.get(t.charAt(i)).add(i);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map2.put(t.charAt(i), list);
            }
        }
        return new ArrayList<List<Integer>>(map1.values()).equals(new ArrayList<List<Integer>>(map2.values()));
    }

/*****************************************************************************/

    //Time Limit Exceeded
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j) ||
                        s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
