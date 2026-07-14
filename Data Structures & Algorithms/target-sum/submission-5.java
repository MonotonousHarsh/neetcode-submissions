class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return backtrack(nums,0,target,0,0);
    }
    
    public int backtrack(int[] nums,int i,int target,int sum,int count){


        if(i == nums.length && sum == target){
            
            return 1;
        }

        if(i == nums.length && sum != target){
            return 0;
        }

        int left;
        int right;

      

            // left branch
          left = backtrack(nums,i+1,target,(-nums[i] + sum),count);

          if(left == target){
            count++;

          }
          
            //right branch 
          right = backtrack(nums,i+1,target,nums[i] + sum,count);

          if(right == target){
            count++;
          }
            
        

        return left + right;
    }
}
