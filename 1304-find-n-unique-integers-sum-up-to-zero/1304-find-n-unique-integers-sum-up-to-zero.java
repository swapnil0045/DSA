class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; index+1 < n; i++) {
            ans[index] = i;
            ans[index + 1] = (-1) * i;
            index += 2;
        }
        if (index < n) {
            ans[index] = 0;
        }
        return ans;
    }
}