class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>tempList = new ArrayList<>();

        return backtrack(0,nums,result,tempList);    

        }

public List<List<Integer>> backtrack(int index,int[] nums,List<List<Integer>>result,List<Integer>tempList){
            
            if(nums.length == index){
             result.add(new ArrayList<>(tempList));
             return result;
            }
            tempList.add(nums[index]);
            backtrack(index+1,nums,result,tempList);
            tempList.remove(tempList.size()-1);
            backtrack(index + 1, nums, result, tempList);
            return result;
        }
}
