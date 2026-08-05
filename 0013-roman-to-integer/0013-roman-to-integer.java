class Solution {
    public int romanToInt(String s) {
        int[] map = new int[128];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map[s.charAt(i)];

            if (i + 1 < s.length() && curr < map[s.charAt(i + 1)]) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}