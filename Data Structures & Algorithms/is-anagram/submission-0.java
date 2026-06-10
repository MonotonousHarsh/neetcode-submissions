class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String sortedS = new String(sArray);
        String sortedT = new String(tArray);

        boolean anagram = sortedS.equals(sortedT);

        return anagram;


    }
}
