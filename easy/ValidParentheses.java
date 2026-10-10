class Solution {
    public boolean isValid(String s) {
        if (s.isBlank() || s.length() == 1) return false;
        List<Integer> satisfied = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpen(c)) {
                satisfied.add(getKey(c));
                continue;
            }
            if (isClosed(c)) {
                if(satisfied.isEmpty()) return false;
                if(satisfied.getLast() == getKey(c)) {
                    satisfied.removeLast();
                } else return false;
            }
        }
        return satisfied.isEmpty();
    }

    private int getKey(char c) {
        if (c == '(' || c == ')') return 0;
        if (c == '{' || c == '}') return 1;
        if (c == '[' || c == ']') return 2;
        return -1;
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isClosed(char c) {
        return c == ')' || c == '}' || c == ']';
    }
}
