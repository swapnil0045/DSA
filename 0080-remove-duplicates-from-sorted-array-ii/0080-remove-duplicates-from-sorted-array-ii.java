class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int ans  = 0 ; 
        for(int i = 0 ; i < n ; i++){
            if(ans < 2 || nums[i]!=nums[ans-2]){
                nums[ans] = nums [i] ; 
                ans++;
            }
        }
        return ans ; 
    }
}