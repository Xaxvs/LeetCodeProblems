class Solution {
    public int lengthOfLastWord(String s) {
        char[] charArr = s.toCharArray();
        int length = 0;
        boolean matched = false;
        for(int i = charArr.length - 1; i >= 0; i--) {
            char c = charArr[i];
            if(c == ' ') {
                if(matched) break;
                continue;
            }
            matched = true;
            length++;
        }

        return length;
    }
}
