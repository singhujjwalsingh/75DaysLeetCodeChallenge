class Solution {
    public int characterReplacement(String s, int k) {
     
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // increase frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // update max frequency
            maxFreq = Math.max(maxFreq, map.get(ch));

            // if window invalid → shrink
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}