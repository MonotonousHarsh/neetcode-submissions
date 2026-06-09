class Solution {
    public int maxArea(int[] heights) {

        List<Integer> list = new ArrayList<>();
       
            int left = 0;
            int right = heights.length-1;
            int maxArea = 0;
            while(left < right){
            int width = right - left;
            int height = Math.min(heights[left],heights[right]);
            int currentArea = height * width;

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }

            maxArea = Math.max(maxArea , currentArea);
            
            }
return maxArea;
       
    
    }
}
