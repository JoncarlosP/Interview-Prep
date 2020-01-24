class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int begin = 0, end = 0, counter = map.size();
        
        while(end < s2.length()) {
            char c1 = s2.charAt(end);
            if(map.containsKey(c1)) {
                map.put(c1, map.get(c1) - 1);
                if(map.get(c1) == 0) {
                    counter--;
                }
            }
            end++;
            
            while(counter == 0) {
                if(end - begin == s1.length()) {
                    return true;
                }
                
                char c2 = s2.charAt(begin);
                if(map.containsKey(c2)) {
                    map.put(c2, map.get(c2) + 1);
                    if(map.get(c2) > 0) {
                        counter++;
                    }
                }
                begin++;
            }
        }
        
        return false; 
    }
}
