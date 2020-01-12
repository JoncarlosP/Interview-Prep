public class Solution {
    public int isPrime(int A) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(A); i++) {
            if(A % i == 0) {
                result.add(i);
                if(A/i != Math.sqrt(A)) {
                    result.add(A/i);
                }
            }
        }
        if(result.size() == 2) {
            return 1;
        }
        return 0;
    }
}
