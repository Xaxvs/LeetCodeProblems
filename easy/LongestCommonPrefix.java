class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 1) return strs[0];
        for (int a = 0; a < strs.length; a++) {
            String str = strs[a];
            if (str.isBlank()) return "";
            if (prefix.isBlank()) {
                prefix = str;
                continue;
            }

            char[] currentChars = str.toCharArray();
            String newChars = "";
            for (int i = 0; i < currentChars.length; i++) {
                if (prefix.length() <= i) break;
                if (prefix.charAt(i) != currentChars[i]) {
                    if (newChars.isBlank()) return "";
                    prefix = newChars;
                    continue;
                }
                newChars += currentChars[i];
            }
            prefix = newChars;
        }
        return prefix;
    }
}
