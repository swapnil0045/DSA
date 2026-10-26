
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            int j = words[i].length() - 1;

            while (j >= 0) {
                ans = ans + words[i].charAt(j);
                j--;
            }

            if (i < words.length - 1) {
                ans = ans + " ";
            }
        }

        return ans;
    }
}
