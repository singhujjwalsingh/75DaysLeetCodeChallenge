class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1; 
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            char ch = Character.toLowerCase(s.charAt(start)); //to convert  in lowercases
            char cr = Character.toLowerCase(s.charAt(end));
            if (ch != cr) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}