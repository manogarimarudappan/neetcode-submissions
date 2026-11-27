class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> conChar = new HashSet<>();

        //We use two pointers to maintain a sliding window of unique characters. Expand the window using the right pointer, shrink it using the left pointer whenever a duplicate occurs, and continuously update the maximum window length.
        int maxLength = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (conChar.contains(s.charAt(r)) == true) {
                conChar.remove(s.charAt(l));//If the current character (r) already exists in our Set, we need to remove characters from the beginning (l) until that duplicate is gone.
                l++;
            }

            conChar.add(s.charAt(r));
            maxLength = Math.max(maxLength, (r - l + 1));
         //   System.out.println("conChar " + conChar + " maxLength " + maxLength);
        }
        return maxLength;
    }
}
