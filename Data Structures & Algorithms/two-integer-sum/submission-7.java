
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> indexMap = new HashMap();

        for(int i=0; i<= nums.length-1; i++){

            int reqSecNum = target - nums[i];

            if(indexMap.containsKey(reqSecNum)){
                System.out.println("wwww"+reqSecNum);
                return new int[]{indexMap.get(reqSecNum),i};
            }
 System.out.println("hhhh nums[i]"+nums[i]+" i= "+i);
            indexMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
