class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int area=0;
        while(left<right){
            int l=Math.min(h[left],h[right]);
            int b=right-left;
            int a=l*b;
            area=Math.max(a,area);
            if(h[left] < h[right]) left++; 
            else right--;
        }
    return area;
    }
}