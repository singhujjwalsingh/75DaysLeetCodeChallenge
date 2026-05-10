class Solution {
    public int largestRectangleArea(int[] nums) {
        

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        int n = nums.length;

        for (int i = 0; i <= n; i++) {

            int currHeight = (i == n) ? 0 : nums[i];

            while (!stack.isEmpty() &&

                   currHeight < nums[stack.peek()]) {

                int height = nums[stack.pop()];

                int right = i;

                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;

                maxArea = Math.max(maxArea, height * width);

            }

            stack.push(i);

        }

        return maxArea;

    }

}