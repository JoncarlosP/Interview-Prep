public class Solution {
    public int[][] prettyPrint(int A) {
        int[][] result = new int[A * 2 - 1][A * 2 - 1];
        int L = 0; 
        int R = result.length - 1;
        int T = 0;
        int B = result.length - 1;
        int dir = 0;
        while(A != 0) {
            if(dir == 0) {
                for(int i = L; i <= R; i++) {
                    result[T][i] = A;
                }
                T++;
                dir++;
            } else if(dir == 1) {
                for(int i = T; i <= B; i++) {
                    result[i][R] = A;
                }
                R--;
                dir++;
            } else if(dir == 2) {
                for(int i = R; i >= L; i--) {
                    result[B][i] = A;
                }
                B--;
                dir++;
            } else if(dir == 3) {
                for(int i = B; i >= T; i--) {
                    result[i][L] = A;
                }
                L++;
                A--;
                dir = 0;
            }
        }
        return result;
    }
}
