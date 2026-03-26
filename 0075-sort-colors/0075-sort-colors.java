class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<2) return;
        int s=0,m=0;
        int e=nums.length-1;
        while( m<=e){
            if(nums[m]==0) swap(nums,s++,m++);
            else if(nums[m]==1 ) m++;
            else swap(nums,m,e--);

        }
    }
     private void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}
