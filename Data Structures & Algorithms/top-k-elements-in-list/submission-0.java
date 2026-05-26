class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        Set<Integer> finalOp = new HashSet<>();
       for(int i=0; i<nums.length;i++){

         map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        if(map.getOrDefault(nums[i], 0) >= k){
            finalOp.add(nums[i]);
        }   

       } 
       return finalOp.stream().mapToInt(Integer::intValue).toArray();
    }
}
