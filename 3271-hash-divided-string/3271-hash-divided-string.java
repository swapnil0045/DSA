class Solution {
    public String stringHash(String s, int k) {
        String ans = "";
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                int count = s.charAt(j) - 'a';
                sum += count;
            }
            int temp = sum % 26;
            char ch = (char) ('a' + temp);
            ans = ans + ch;
        }
        return ans;
    }
}