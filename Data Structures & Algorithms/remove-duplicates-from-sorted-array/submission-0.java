class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPointer = 1;
        
        
        for(int i = 1; i < nums.length; i++){

            if(nums[i] !=  nums[i-1]){
                nums[insertPointer] = nums[i];
                insertPointer++;
            }
          
        }
        
        
        return insertPointer;
    }
}