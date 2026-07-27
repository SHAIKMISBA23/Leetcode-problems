class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        int zeros = s.length() - ones;

        StringBuilder result = new StringBuilder();

        // Place remaining 1's at the beginning
        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }

        // Place all 0's
        for (int i = 0; i < zeros; i++) {
            result.append('0');
        }

        // Last bit must be 1
        result.append('1');

        return result.toString();
    }
}
