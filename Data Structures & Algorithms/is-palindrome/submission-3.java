class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      //  result.toLowerCase();
        int j = result.length() - 1;
        int i=0;
        System.out.println( "result = "+result);
        while(i !=j && i < j){
            if(result.charAt(i) != result.charAt(j)){
                System.out.println( "i = "+i+" j= "+j);
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
