// Time complexity : O(1) Space complexity: O(n)
public class Solution {
    public String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        while(A != 0 && A!= 1) {
            int temp = A;
            sb.insert(0, temp % 2);
            A /= 2;
        }
        sb.insert(0, A);
        return sb.toString();
    }
}
