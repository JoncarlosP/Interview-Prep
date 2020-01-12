public class Solution {
    public int[] sieve(int A) {
        int[] primes = new int[A.length + 1];
        for(int i = 0; i <= A.length; i++) {
            primes[i] = i;
        }
        primes[0] = 0;
        primes[1] = 0;
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(primes[i] == 1) {
                for(int j = 2; i + j <= A.lengthl j++) {
                    primes[i * j] = 0;
                }
            }
        }
    }
}
