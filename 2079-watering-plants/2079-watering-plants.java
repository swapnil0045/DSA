class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0 ; 
        int temp = capacity ; 
        for(int i = 0 ; i < plants.length ; i++){
           
           if(temp < plants[i]){
             
            ans += 2*i;
            temp =  capacity ;
           }
           temp = temp - plants[i];
            ans++;
        }
        return ans; 
    }
}