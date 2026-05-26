class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for(int num : nums){
            set.add(num);
        }
        Integer firstEle =  set.first();
        int i=0;
        Integer next=0;
        int longestSequence = 0;
        Integer prev=0;
        System.out.println("sorted Array"+set);
        int oldSeqSize = 0;
        for( Integer ele : set){
            
            System.out.println("i"+i);
            if(i==0) {
                longestSequence++;
            }else if(ele == prev+1){
                longestSequence++;
            }else{
                System.out.println("dddddddd");
                
                oldSeqSize = (oldSeqSize >= longestSequence) ? oldSeqSize:  longestSequence;
                longestSequence =1;
            }
            prev = ele;
            System.out.println("Prev"+prev);
            System.out.println("current ele"+ele);
            System.out.println("longestSequence"+longestSequence);
            i++;
        }
        return (oldSeqSize >= longestSequence) ? oldSeqSize:  longestSequence;
    }
}
