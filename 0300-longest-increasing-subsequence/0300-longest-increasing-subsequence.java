class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tails=new ArrayList<>();
        for(int num:nums){
        int index=lowerBoundBS(tails,num);
        if(index==tails.size()){
            tails.add(num);
        }
        else{
            tails.set(index,num);
        }
        }
        return tails.size();
    }
    int lowerBoundBS(ArrayList<Integer> tails,int target){
        int low=0;
        int high=tails.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(tails.get(mid)>=target) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}