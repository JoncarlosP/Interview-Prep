class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if(digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        letterCombinationRecursive(result, digits, mapping, 0, "");
        return result;
    }
    
    public void letterCombinationRecursive(List<String> result, String digits, String[] mapping, int index, String current) {
        if(current.length() == digits.length()) {
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++) {
            letterCombinationRecursive(result, digits, mapping, index + 1, current + letters.charAt(i));
        }
    }
}
