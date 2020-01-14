class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<Integer>(), result);
        
        return result;
    }
    
    public void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, subsets);
            current.remove(current.size() - 1);
        }
    }
}
