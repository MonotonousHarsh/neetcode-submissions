class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return backtrack(nums,0,target,0);
    }
    
    public int backtrack(int[] nums,int i,int target,int sum){


        if(i == nums.length && sum == target){
            
            return 1;
        }

        if(i == nums.length && sum != target){
            return 0;
        }

       

      

            // left branch
         int left = backtrack(nums,i+1,target,(-nums[i] + sum));

          
          
            //right branch 
         int right = backtrack(nums,i+1,target,nums[i] + sum);

           
        

        return left + right;
    }
}
