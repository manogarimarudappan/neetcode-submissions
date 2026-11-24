class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSumIndices = new ArrayList<>();
        // System.out.println("Sorted Array " + Arrays.toString(nums));
        for (int i = 0; i < nums.length - 2; i++) {
            // if (nums[i] > 0)
            //     break; // then every element to the right is also ≥ nums[i] and therefore positive.
            int j = i + 1;
            int k = nums.length - 1;
            // while (i != j && j != k) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    //   System.out.println("i = " + i + " j = " + j + " k = " + k);
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[j]);
                    res.add(nums[k]);
                    threeSumIndices.add(res);
                    j++;
                    k--;
                    // Skip duplicates for j -- Missed
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicates for k -- Missed
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;

                } else if (sum < 0) {
                    j++;
                }
            }
        }
        return threeSumIndices;
    }
}
