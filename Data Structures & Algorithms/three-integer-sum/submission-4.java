class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> outerList = new ArrayList<>();
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            int target = nums[i];
            int start = i + 1;
        int end = nums.length-1;
        
        if(i > 0 && nums[i] == nums[i-1]) continue;
            while(start < end){
                int sum = target + nums[start] + nums[end];
            if(sum < 0){
                start++;
            }
            else if(sum > 0){
                end--;
            }

            else{
               outerList.add(Arrays.asList(nums[i],nums[start],nums[end]));
               start++;
               end--;

               while(start < end && nums[start] == nums[start-1] ){
                start++;
               }
               while(start < end && nums[end] == nums[end+1]){
                end--;
               }

            }             

            }

            
        }

        return outerList;

        
    }
}
