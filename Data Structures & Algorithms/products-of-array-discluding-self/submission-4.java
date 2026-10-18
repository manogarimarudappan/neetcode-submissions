class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int[] suffixArr = new int[nums.length];

        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i <= nums.length - 1; i++) {
            prefixArr[i] = prefix;
            prefix = prefix * nums[i];
        }
       // System.out.println(Arrays.toString(prefixArr));
        for (int j = nums.length - 1; j >= 0; j--) {
            prefixArr[j] = prefixArr[j] * suffix;
            suffix = suffix* nums[j];
        }
        return prefixArr;
    }
}
