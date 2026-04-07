class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=pivot(nums,start,end);
        if(pivot==-1) return BinarySearch(nums,target,start,end);
        if(nums[pivot]==target) return pivot;
        if(target>=nums[0]) return BinarySearch(nums,target,start,pivot-1);
        else return BinarySearch(nums,target,pivot+1,end);

    }
     int BinarySearch(int[] nums, int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target < nums[mid]) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else return mid;
        }
        return -1;
    }
    
    int pivot(int[] nums,int start, int end){
        while(start<=end){
           int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid]<=nums[start]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}