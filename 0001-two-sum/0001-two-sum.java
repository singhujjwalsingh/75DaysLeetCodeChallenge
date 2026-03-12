class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int d=target-nums[i];
            if(a.containsKey(d)){
                 return new int[] {i,a.get(d)};
            }
            a.put(nums[i],i);
        }
        return new int[] {};
    }
}