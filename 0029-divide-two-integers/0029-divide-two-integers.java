class Solution {
    public int divide(int dividend, int divisor) {
        // Overflow case
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // Work with positive numbers
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long ans = 0;
        while(dvd >= dvs) {
            int shift = 0;
            // Find largest power of 2 multiple
            while(dvd >= (dvs << (shift + 1))) {
                shift++;
            }
            // Add that multiple to answer
            ans += (1L << shift);
            // Remove that value from dividend
            dvd -= (dvs << shift);
        }
        // Check sign
        if((dividend < 0) ^ (divisor < 0)) {
            ans = -ans;
        }
        return (int) ans;
    }
}