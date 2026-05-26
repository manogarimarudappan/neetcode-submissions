class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int[] result = new int[nums.length];

        result[0]=1;
        //Prefix sum done
        for(int i=1;i<nums.length;i++){
            result[i]= result[i-1]*nums[i-1];
        }
        System.out.println("Prefix"+ Arrays.toString(result));
        //Suffix sum
        //input =>  1,2,4,6
        //prefix => 1,1,2,8
        //suffix => 1,24,12,8
        //Expex  =>48,24,12,8
        int prefix=1;
         for(int i=nums.length-1;i>=0;i--){
            result[i]= result[i]*prefix;
            prefix=prefix*nums[i];
        }
        System.out.println("Suffix" + Arrays.toString(result));
        return result;
    }
}  
