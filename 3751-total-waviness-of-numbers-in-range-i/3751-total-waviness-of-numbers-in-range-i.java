class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int j = num1; j <= num2; j++) {
            int[] arr = new int[10];
            int temp = j;
            int count = 0;
            while (temp > 0) {
                arr[count] = temp % 10;
                temp /= 10;
                count++;
            }
            for (int i = 1; i < count - 1; i++) {
                if ((arr[i] > arr[i-1] && arr[i] > arr[i+1]) || (arr[i] < arr[i-1] && arr[i] < arr[i+1])) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
