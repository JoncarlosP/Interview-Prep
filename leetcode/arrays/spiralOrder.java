// Time Complexity = O(n) Space Complexity = O(1)
// Set boundaries Top(T), Right(R), Bottom(B), Left(L) then traverse according to this bounds. 
public class Solution {
    public int[] spiralOrder(final int[][] A) {
        int[] result = new int[A.length * A[0].length];
        int idx= 0;
        int T = 0;
        int B = A.length - 1;
        int L = 0;
        int R = A[0].length - 1;
        int dir = 0;
        while(T <= B && L <= R){
            if(dir == 0) {
                for(int i = L; i <= R; i++) {
                    result[idx++] = A[T][i];
                }
                T++;
            } else if(dir == 1) {
                for(int i = T; i <= B; i++) {
                    result[idx++] = A[i][R];
                }
                R--;
            } else if(dir == 2) {
                for(int i = R; i >= L; i--) {
                    result[idx++] = A[B][i];
                }
                B--;
            } else if(dir == 3) {
                for(int i = B; i >= T; i--) {
                    result[idx++] = A[i][L];
                }
                L++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}
