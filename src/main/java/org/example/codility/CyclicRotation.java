package org.example.codility;


public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        while(K > 0) {
            int[] result = new int[A.length];
            for (int i=0; i<A.length-1; i++) {
                result[i + 1] = A[i];
            }
            result[0] = A[A.length-1];
            A = result;
            K--;
        }
        return A;
    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        //[3, 8, 9, 7, 6]
        int[] A = {3, 8, 9, 7, 6};
        cyclicRotation.solution(A, 3);
    }
}
