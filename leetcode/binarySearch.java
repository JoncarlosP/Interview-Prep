//Time Complexity = O(log(n)) Space Complexity = O(1)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int findCount(final int[] A, int B) {
        int first = binarySearchOccurence(A, B, true);
        int last = binarySearchOccurence(A, B, false);
        return last - first + 1;
    }
    public int binarySearchOccurence(int[] A, int B, boolean FirstOccurence) {
        int low = 0;
        int high = A.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(B > A[mid]) {
                low = mid + 1;
            } else if (B < A[mid]) {
                high = mid - 1;
            } else {
                result = mid;
                if(FirstOccurence) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return result;
    }
}
