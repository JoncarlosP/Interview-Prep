public class Solution {
    public int[] allFactors(int A) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(A); i++){
            if(A % i == 0){
                result.add(i);
                if(A/i != Math.sqrt(A)){
                    result.add(A/i);
                }
            }
        }
        Collections.sort(result);
        int[] intArray = new int[result.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = result.get(i);
        }
        return intArray;
    }
}
