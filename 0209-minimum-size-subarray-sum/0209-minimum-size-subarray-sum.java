class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int n = nums.length;
        while(r<n){
            sum += nums[r];
            while(sum>=target){
                int length = (r - l + 1);
                minLength = Math.min(length,minLength);
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}