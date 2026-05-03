class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] array=new int[nums.length];
        //int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i]*nums[i];
        }
        Arrays.sort(array);
        return array;
    }
}