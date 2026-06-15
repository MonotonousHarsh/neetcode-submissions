class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;

        if(nums[0] == 0 && nums.length == 1 ){
            return new int[]{0};
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                arr[l] = nums[i];
                l++;
            }
            else{
            arr[r] = nums[i];
            r--;

        }
        }

        return arr;
        
    }
}