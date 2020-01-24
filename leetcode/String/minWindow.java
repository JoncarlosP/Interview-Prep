class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) {
            return "";
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        int counter = map.size();
        
        int begin = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        
        while(end < s.length()) {
            char c1 = s.charAt(end);
            if(map.containsKey(c1)) {
                map.put(c1, map.get(c1) - 1);
                if(map.get(c1) == 0) {
                    counter--;
                }
            }
            end++;
            
            while(counter == 0) {
                char c2 = s.charAt(begin);
                if(map.containsKey(c2)) {
                    map.put(c2, map.get(c2) + 1);
                    if(map.get(c2) > 0) {
                        counter++;
                    }
                }
                
                if(minLen > end - begin) {
                    minLen = end - begin;
                    minStart = begin;
                }
                begin++;
            }
        }
        
        if(minLen == Integer.MAX_VALUE)
            return "";
        return s.substring(minStart, minStart + minLen);
    }
}
