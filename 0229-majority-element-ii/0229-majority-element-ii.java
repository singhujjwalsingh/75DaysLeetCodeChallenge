class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int count1=0,count2=0;
        int el1=0,el2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && el2!=nums[i]){
                el1=nums[i];
                count1++;
            }
            else if(count2==0 && el1!=nums[i]){
                el2=nums[i];
                count2++;
            }
            else if(el1==nums[i]) count1++;
            else if(el2==nums[i]) count2++;
            else {
                count1--;
                count2--;
        }
    }
   count1=0;
   count2=0;
   for(int i=0;i<nums.length;i++){
    if(nums[i]==el1)count1++;
    else if(nums[i]==el2) count2++;
   }
   if(count1>nums.length/3) ans.add(el1);
   if(count2>nums.length/3) ans.add(el2);
   return ans;
}
}