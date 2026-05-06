class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Map<Character, Long>> finalMap = new LinkedHashMap<>();

        for (int i = 0; i < strs.length; i++) {
            Map<Character, Long> countMap = strs[i].chars()   // IntStream of chars
                .mapToObj(c -> (char) c)                     // convert to Character
                .collect(Collectors.groupingBy(
                    c -> c,
                    Collectors.counting()
                ));
            finalMap.put(i + "_" + strs[i], countMap);
        }

        Map<Map<Character, Long>, List<String>> stringList =
            finalMap.entrySet().stream()
                .collect(Collectors.groupingBy(
                    Map.Entry::getValue,                        // group by the inner map
                    Collectors.mapping(
                        e -> e.getKey().substring(e.getKey().indexOf("_") + 1), // collect outer keys (strings)
                        Collectors.toList()
                    )
                ));

        return new ArrayList<>(stringList.values());
    }
}