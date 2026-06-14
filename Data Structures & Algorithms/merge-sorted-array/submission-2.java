class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int right = nums1.length-1;
        if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];                
            }
        }else{

            for(int j = 0; j < n; j++){
                if(nums2[j] < nums1[j] || nums1[right] == 0){
                    nums1[right] = nums2[j];
                    right--;
                }
            }
            Arrays.sort(nums1);
        }
        
    }
}