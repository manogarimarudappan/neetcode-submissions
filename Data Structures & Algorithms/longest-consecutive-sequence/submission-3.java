class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums.length ==0) return 0;

        HashSet<Integer> set = new HashSet();
         for(int num : nums){
            set.add(num);
         } 
            int longestSeq = 0;
            int currentSeq = 0;
         for(Integer currentNum : set){

            if(!set.contains(currentNum-1)){
                currentSeq=1;

                while(set.contains(currentNum+1)){
                    currentSeq++;
                    currentNum++;
                }
                longestSeq = (longestSeq >= currentSeq) ? longestSeq : currentSeq;
            }
        }
        return longestSeq;
    }
}
