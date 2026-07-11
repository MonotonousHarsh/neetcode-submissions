
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        // An IP address cannot have more than 12 digits
        if (s.length() > 12) {
            return result;
        }
        backtrack(s, result, 0, 0, "");
        return result;
    }

    public void backtrack(String s, List<String> result, int dots, int i, String curIp) {
        // Base Case: If we used all characters and placed exactly 4 segments
        if (i == s.length() && dots == 4) {
            // Remove the trailing dot added by the last recursive call
            curIp = curIp.substring(0, curIp.length() - 1);
            result.add(curIp);
            return; 
        }
        
        // Pruning: If we exceed 4 segments or reach the end too early
        if (dots > 4 || i >= s.length()) {
            return;
        }

        // Try chunks of length 1, 2, and 3
        for (int j = i; j < Math.min(i + 3, s.length()); j++) {
            String segment = s.substring(i, j + 1);
            
            // Check 1: Must be less than or equal to 255
            // Check 2: No leading zeros (e.g., "01" is invalid, but "0" is valid)
            if (Integer.parseInt(segment) <= 255 && (segment.length() == 1 || segment.charAt(0) != '0')) {
                backtrack(s, result, dots + 1, j + 1, curIp + segment + ".");
            } 
        }
    }
}
