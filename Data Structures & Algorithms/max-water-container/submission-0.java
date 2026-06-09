class Solution {
    public int maxArea(int[] heights) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < heights.length; i++){
            int target = heights[i];
            int left = 0;
            int right = heights.length-1;
            while(left < heights.length){
                int xLeft = Math.abs(left - i);
                int xRight = Math.abs(right - i);

                int h = Math.min(target, heights[left]);
                int area = h * xLeft;
                left++;
                list.add(area);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);      
        
    }
}
