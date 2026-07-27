class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                seenDigit = true;
            } 
            else if (ch == '+' || ch == '-') {
                // Sign is valid only at the beginning or immediately after e/E
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } 
            else if (ch == '.') {
                // Dot cannot appear after exponent or more than once
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
            } 
            else if (ch == 'e' || ch == 'E') {
                // Exponent must appear only once and after a digit
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                seenDigit = false; // Must have digits after exponent
            } 
            else {
                return false;
            }
        }

        return seenDigit;
    }
}
