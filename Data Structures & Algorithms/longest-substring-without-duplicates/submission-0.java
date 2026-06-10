class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxSize = 0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);
            maxSize = Math.max(maxSize,right - left + 1);

        }
        return maxSize;
    }

}
