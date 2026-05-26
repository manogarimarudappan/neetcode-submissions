class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Set<Integer> finalOp = new HashSet<>();
       for(int i=0; i<nums.length;i++){
         map.put(nums[i],map.getOrDefault(nums[i], 0)+1); 
       } 
       int[] topKKeys = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(k)
            .map(Map.Entry::getKey) 
            .mapToInt(Integer::intValue) 
            .toArray();
       return topKKeys;
    }
}
