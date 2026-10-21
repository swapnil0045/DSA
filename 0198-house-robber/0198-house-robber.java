class Solution {
    public int rob(int[] nums) {
        int count1 = 0 ;
        int count2 = 0 ;
        
        for(int i=0 ; i<nums.length ; i++){
         int max = Math.max(count1 , count2 + nums[i]);
         count2 = count1 ; 
         count1 = max ; 
        } 

        return count1 ;       
    
    }
}