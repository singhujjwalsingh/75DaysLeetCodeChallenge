class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet <Integer> set=new HashSet<>();
        int sum=0;
        int prevrem=0;
        for(int i=0;i<nums.length;i++){
            //set.add(nums[i]%k);
            sum+=nums[i];
            int rem=sum%k;
                if(set.contains(rem)) return true;
            set.add(prevrem);
            prevrem=rem;
        }
        return false;
    }
}