class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int greed_i = 0;
        int size_j = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(greed_i < g.length && size_j < s.length){
            
            if(g[greed_i] <= s[size_j]){
                count++;   
                greed_i++;             
            }
            
            size_j++;
        }

        return greed_i;

        
    }
}