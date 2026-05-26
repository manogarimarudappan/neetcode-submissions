class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            productArr[i]=1;
        }
        
        for(int i=0; i<nums.length; i++){
            int j=0;
            while(j< nums.length){
                if(i != j){
                productArr[i] = productArr[i] * nums[j];
                }
                j++;
            }
        }

        //  for(int i=0; i<nums.length; i++){
        //     productArr[i]= productArr[nums.length-1] / nums[i];
        //  }
    return productArr;

        
    }
}  
