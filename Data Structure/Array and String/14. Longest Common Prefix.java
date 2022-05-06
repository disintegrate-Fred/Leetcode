// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Example 2:
// Input: strs = ["dog","racecar","car"]
// Output: ""

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // no common prefix
        if (strs.length == 0)
            return "";
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                
                // shortening prefix by 1 every time
                prefix = prefix.substring(0, prefix.length() - 1);
                
                //no common prefix
                if (prefix.isEmpty())
                    return "";
            }
        
        return prefix;
    }
}
