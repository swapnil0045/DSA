class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int count1 = 0;

        for (String row : bank) {
            int count2 = 0;
            for (char ch : row.toCharArray()) {
                if (ch == '1') {
                    count2++;
                }
            }
            if (count2 == 0) {
                continue;
            }
            ans += count1 * count2;
            count1 = count2;
        }

        return ans;
    }
}
