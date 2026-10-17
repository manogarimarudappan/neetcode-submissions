class Solution {
    public int[] twoSum(int[] nums, int target) {
     //   Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = 0;
            sum = nums[i] + nums[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else if(sum == target){
                return new int[] {i, j};
            }
        }
        return new int[]{};
    }
}
