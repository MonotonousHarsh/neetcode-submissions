class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        return backtrack(nums,tempList,result);
    }

    public List<List<Integer>> backtrack(int[] nums,List<Integer>tempList,List<List<Integer>> result){

        if(nums.length == tempList.size()){
            result.add(new ArrayList<>(tempList));
            return result;
        }

        for(int number: nums){

            if(tempList.contains(number)){
                continue;
            }

            tempList.add(number);
            backtrack(nums,tempList,result);
            tempList.remove(tempList.size() - 1);
        }
        return result;       

    }
}
