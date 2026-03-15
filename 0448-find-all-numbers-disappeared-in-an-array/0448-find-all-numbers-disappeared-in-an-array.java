class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> a=new HashMap<>();
        for(int n:nums){
            a.put(n,a.getOrDefault(n,0)+1);
        }
        List<Integer> r=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!a.containsKey(i)) r.add(i);
        }
        return r;
    }
}