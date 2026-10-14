class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap <Integer,Integer> ans = new HashMap<>();
        int n = arr.length/4;
        for (int num : arr) {
            ans.put(num, ans.getOrDefault(num, 0) + 1);
            if (ans.get(num) > n) {
                return num;
            }
        }
        return 0 ;
    }
}