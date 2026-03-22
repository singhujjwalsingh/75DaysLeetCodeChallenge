class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=nums.length-1;
        while(a<b){
            int sum=nums[a]+nums[b];
            if(sum==target) return new int[] {a+1,b+1};
            else{
                if(sum>target) b--;
                else a++;
            }
        }
        return new int[] {-1,-1};
    }
}