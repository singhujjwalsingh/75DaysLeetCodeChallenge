class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=max(piles);
        while(low<=high){
            int mid=low+(high-low)/2;
            long target=countHours(piles,mid);
            if(target<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    int max(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++) max=Math.max(max,piles[i]);
        return max;
    }
    long countHours(int[] piles, int speed) {
    long hrs = 0;
    for (int banana : piles) {
        hrs += (banana + speed - 1) / speed;
    }
    return hrs;
}
}