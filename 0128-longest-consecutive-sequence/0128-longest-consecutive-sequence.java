class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int longest=1;
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
        for(int it:set){
            if(!set.contains(it-1)){
                int x=it;
                int count=1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
            }
        }