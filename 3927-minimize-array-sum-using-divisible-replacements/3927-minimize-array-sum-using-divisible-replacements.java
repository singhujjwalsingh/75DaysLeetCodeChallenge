class Solution {
    public long minArraySum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        long sum = 0;
        for(int x : nums){
            int smallest = x;
            for(int d = 1; d * d <= x; d++){
                if(x % d == 0){
                    // divisor d
                    if(set.contains(d)){
                        smallest = Math.min(smallest, d);
                    }
                    // divisor x/d
                    int other = x / d;
                    if(set.contains(other)){
                        smallest = Math.min(smallest, other);
                    }
                }
            }
            sum += smallest;
        }
        return sum;
    }
}