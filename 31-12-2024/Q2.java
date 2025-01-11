class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String pref = strs[0]; 
        
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(pref)) {
                // Gradually reduce the prefix
                pref = pref.substring(0, pref.length() - 1);
                
                if (pref.isEmpty()) {
                    return ""; // No common prefix found
                }
            }
        }
        
        return pref; // Longest common prefix
    }
}
