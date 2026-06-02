class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> anslist = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
           anslist.add(GenRow(i));
        }
        return anslist;
    }
    public static List<Integer> GenRow(int row){
        int ans=1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            list.add(ans);
        }
        return list; 
     }
 }