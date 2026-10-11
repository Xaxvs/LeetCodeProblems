class Solution {
    public int[] plusOne(int[] digits) {

        int v = digits.length - 1;

        for (int i = v; i >= 0; i--) {

            if (digits[i] == 9) {
                if(i == 0) {
                    digits = Arrays.copyOf(digits, v + 2);
                    digits[0] = 1;
                    continue;
                }
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }

        }
        return digits;
    }
}
