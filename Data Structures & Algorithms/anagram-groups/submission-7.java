class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if(strs ==null || strs.length < 2){
        //     return new ArrayList(Arrays.asList(strs));
        // }
        HashMap<String, List<String>> output = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            output.computeIfAbsent(key, k -> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(output.values());
    }
}
