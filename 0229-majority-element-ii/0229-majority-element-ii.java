class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> list =new ArrayList<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
    //     for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    //     }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        return list;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//     int key = entry.getKey();
//     int value = entry.getValue();
//     if(value>n) 
// }
    }
}