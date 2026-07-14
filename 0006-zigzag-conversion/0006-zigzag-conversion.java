class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int cycle = 2 * numRows - 2;

        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycle) {

                ans.append(s.charAt(j));

                int second = j + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 &&
                        second < s.length()) {
                    ans.append(s.charAt(second));
                }
            }
        }

        return ans.toString();
    }
}