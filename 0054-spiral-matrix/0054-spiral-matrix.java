class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m-1;
        int top=0, bottom=n-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(left<=right && top<=bottom){
            //Right
            for(int i=left;i<=right;i++) {
                list.add(matrix[top][i]);
            }
            top++;
            //Bottom
            for(int i=top;i<=bottom;i++) {
                list.add(matrix[i][right]);
            }
                right--;
            //left
            if(top<=bottom){
            for(int i=right;i>=left;i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            //top
            if(left<=right){
            for(int i=bottom;i>=top;i--) {
                list.add(matrix[i][left]);
            }
            left++;
            }

        }
        return list;
    }
}