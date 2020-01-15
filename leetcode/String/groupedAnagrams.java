class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> result = new HashMap<>();
        for(String current: strs) {
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!result.containsKey(sorted)) {
                result.put(sorted, new ArrayList<>());
            }
            
            result.get(sorted).add(current);
        }
        
        groupedAnagrams.addAll(result.values());
        return groupedAnagrams;
    }
}
