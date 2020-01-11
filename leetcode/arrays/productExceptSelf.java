// 1. Create two sub arrays L and R and populate with the products of the left and right respectively
// 2. Populate original array with L * R which is the product except self
// Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] L = new int[nums.length];
        int[] R = new int[nums.length]; 
        L[0] = 1;
        R[nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++) {
            L[i] =  L[i-1] * nums[i-1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            R[i] = R[i+1] * nums[i+1];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = L[i] * R[i];
        }
        return nums;
    }
}
