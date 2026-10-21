class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
        int count = 0 ; 
        while(true){
            if(count == ans.size()){
                ans.add(new ArrayList<>());
            }
            if(!ans.get(count).contains(nums[i])){
                ans.get(count).add(nums[i]);
                break;
            }
            count++;
        }
        }
        return ans ; 
    }
}