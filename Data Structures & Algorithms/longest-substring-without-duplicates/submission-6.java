class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> conChar = new HashSet<>();
        int maxLength = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (conChar.contains(s.charAt(r)) == true) {
                conChar.remove(s.charAt(l));
                l++;
            }

            conChar.add(s.charAt(r));
            maxLength = Math.max(maxLength, (r - l + 1));
         //   System.out.println("conChar " + conChar + " maxLength " + maxLength);
        }
        return maxLength;
    }
}
