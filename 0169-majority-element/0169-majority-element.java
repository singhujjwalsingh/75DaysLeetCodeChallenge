class Solution {
    public int majorityElement(int[] nums) {
        int e=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                e=nums[i];
                count++;
            }
            else if(e==nums[i]) count++;
            else count--;
        }
        return e;
    }
}