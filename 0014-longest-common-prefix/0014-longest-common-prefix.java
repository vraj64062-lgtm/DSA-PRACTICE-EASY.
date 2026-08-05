class Solution {
    public String longestCommonPrefix(String[] strs) {

        int len = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());

            int j = 0;
            while (j < len && strs[0].charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            len = j;

            if (len == 0) {
                return "";
            }
        }

        return strs[0].substring(0, len);
    }
}