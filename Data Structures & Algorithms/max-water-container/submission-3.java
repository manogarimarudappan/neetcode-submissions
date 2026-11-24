class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxArea = 0;
 
        while (i < j) {
            int length = j - i;
            int h = Math.min(heights[i], heights[j]);
            maxArea = Math.max(maxArea, length * h);

            if(h == heights[i]){
                i++;
            }else if(h == heights[j]){
                j--;
            }


        }

        return maxArea;
    }
}
