class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int m=x;
        if(x<0) return false;
        if(x==0) return true;
        if(x>0){
            while(x>0){
                n=n*10+x%10;
                x=x/10;
            }
           
        }
         if(n==m) return true;
            else return false;
    }
}