class Solution {
    
         public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) !=
                    Character.toLowerCase(r)) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
    //     String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    //   //  result.toLowerCase();
    //     int j = result.length() - 1;
    //     int i=0;
    //     System.out.println( "result = "+result);
    //     // while(i !=j && i < j){
    //       while( i < j){
    //         if(result.charAt(i) != result.charAt(j)){
    //             System.out.println( "i = "+i+" j= "+j);
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}
// Best Solution

   

