

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Map<Character, Long>> finalMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            Map<Character, Long> countMap = strs[i].chars()   // IntStream of chars
                .mapToObj(c -> (char) c)                     // convert to Character
                .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                ));
            finalMap.put(strs[i], countMap);
        }

        Map<Map<Character, Long>, List<String>> stringList =
            finalMap.entrySet().stream()
                .collect(Collectors.groupingBy(
                    Map.Entry::getValue,                        // group by the inner map
                    Collectors.mapping(
                        e -> e.getKey(),                        // collect outer keys (strings)
                        Collectors.toList()
                    )
                ));

        return new ArrayList<>(stringList.values());
    }
}


