public class Chapter1 {

    // 1.1
    public boolean checkDifferent(String iniString) {
        if (iniString.length() > 256) {
            return false;
        }
        for (int i = 0; i < iniString.length(); ++i) {
            for (int j = i + 1; j < iniString.length(); ++j) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String reverseString(String iniString) {
        if (iniString == null) {
            return iniString;
        }
        for (int i = 0; i < iniString.length() / 2; ++i) {
            iniString = iniString.substring(0, i) 
                + iniString.charAt(iniString.length() - 1 - i) 
                + iniString.substring(i + 1, iniString.length() - 1 - i) 
                + iniString.charAt(i) 
                + iniString.substring(iniString.length() - i, iniString.length());
        }
        return iniString;
    }

    // 1.4
    public String replaceSpace(String iniString, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iniString.length(); ++i) {
            sb.append(iniString.charAt(i) == ' ' ? "%20" : iniString.charAt(i));
        }
        return sb.toString();
    }

    // 1.5
    public String zipString(String iniString) {
        if (iniString == null) {
            return iniString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iniString.length(); ++i) {
            sb.append(iniString.charAt(i));
            int count = 1;
            while (i < iniString.length() - 1 
                    && iniString.charAt(i) == iniString.charAt(i + 1)) {
                i++;
                count++;
            }
            sb.append(count);
        }
        if (sb.toString().length() > iniString.length()) {
            return iniString;
        }
        return sb.toString();
    }

    // 1.6
    public int[][] transformImage(int[][] mat, int n) {
        if (mat == null) {
            return null;
        }
        int xLen = mat.length;
        int yLen = mat[0].length;
        for (int i = 0; i < xLen / 2; ++i) {
            for (int j = 0; j < (yLen + 1) / 2; ++j) {
                int tmp = mat[i][j];
                mat[i][j] = mat[xLen - 1 - j][i];
                mat[xLen - 1 - j][i] = mat[xLen - 1 - i][yLen - 1 - j];
                mat[xLen - 1 - i][yLen - 1 - j] = mat[j][yLen - 1 - i];
                mat[j][yLen - 1 - i] = tmp;
            }
        }
        return mat;
    }

    // 1.8
    public boolean checkReverseEqual(String s1, String s2) {
        return (s1 + s1).contains(s2);
    }

}