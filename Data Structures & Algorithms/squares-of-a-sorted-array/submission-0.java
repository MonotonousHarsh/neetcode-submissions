class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int square = (nums[i] * nums[i]);
            arr[i] = square;
        }
        Arrays.sort(arr);

        return arr;

    }
}