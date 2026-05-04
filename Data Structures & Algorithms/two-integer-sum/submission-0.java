class Solution {
        public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int[] indArr = new int[2];
 System.out.println("Helloooooooo" + i +"  " + j);
        while(j>i && i<nums.length){
            System.out.println("Helloooooooo" + i +"  " + j);
            if(j <= nums.length-1){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    indArr[0]=i;
                    indArr[1]=j;
                    break;
                }
                j++;
            }else{
                i++;
                j=i+1;
            }

        }
        return indArr;
    }
}


