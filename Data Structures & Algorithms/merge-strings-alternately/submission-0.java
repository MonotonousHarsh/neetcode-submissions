class Solution {
    public String mergeAlternately(String word1, String word2) {

        String merge = "";
        int leftW1 = 0;
        int leftW2 = 0; 
        int count = 0;

        while(leftW1 < word1.length() && leftW2 < word2.length()){
            if(count % 2 == 0){
                merge = merge + word1.charAt(leftW1);
                count++;
                leftW1++;
            }else{
                merge = merge + word2.charAt(leftW2);
                count++;
                leftW2++;
            }
        }

        while(leftW1 < word1.length()){
            merge = merge + word1.charAt(leftW1);
            leftW1++;
        }

         while(leftW2 < word2.length()){
            merge = merge + word2.charAt(leftW2);
            leftW2++;
        }


        return merge;
        
    }
}