class Solution {
    public boolean checkInclusion(String s1, String s2) {
       

        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];

        int[] window = new int[26];

        // frequency of s1

        for (char ch : s1.toCharArray()) {

            s1Count[ch - 'a']++;

        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            window[s2.charAt(right) - 'a']++;

            // maintain window size

            if (right - left + 1 > s1.length()) {

                window[s2.charAt(left) - 'a']--;

                left++;

            }

            // compare frequencies

            if (matches(s1Count, window)) {

                return true;

            }

        }

        return false;

    }

    private boolean matches(int[] a, int[] b) {

        for (int i = 0; i < 26; i++) {

            if (a[i] != b[i]) return false;

        }

        return true;

    }

}