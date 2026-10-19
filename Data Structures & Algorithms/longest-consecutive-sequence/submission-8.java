class Solution {
    public int longestConsecutive(int[] nums) {
        // Logic is finding the previous number, if not there find the next number

        HashSet<Integer> numSet = new HashSet();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestSequenceCount = 0;
        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                int steak =0;
                int currentNum = num;
                while (numSet.contains(currentNum)) {
                    steak++;
                    currentNum++;
                }
                longestSequenceCount = Math.max(longestSequenceCount, steak);
            }
        }
        return longestSequenceCount;
    }
}
