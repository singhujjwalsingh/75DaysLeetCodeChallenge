class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int idx = findPosition(intervals, newInterval[0]);
        for(int i = 0; i < idx; i++) {
            ans.add(intervals[i]);
        }
        while(idx < n && intervals[idx][0] <= newInterval[1]) {
            newInterval[0] =Math.min(newInterval[0],intervals[idx][0]);
            newInterval[1] =Math.max(newInterval[1],intervals[idx][1]);
            idx++;
        }
        ans.add(newInterval);
        while(idx < n) {
            ans.add(intervals[idx++]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
    int findPosition(int[][] intervals, int target) {
        int low = 0;
        int high = intervals.length - 1;
        int ans = intervals.length;
        while(low <= high) {
            int mid =low + (high - low) / 2;
            if(intervals[mid][1] >= target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}