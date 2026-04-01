class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            int tempmax=Math.max(n,Math.max(n*max,n*min));
            int tempmin=Math.min(n,Math.min(n*max,n*min));
            max=tempmax;
            min=tempmin;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}