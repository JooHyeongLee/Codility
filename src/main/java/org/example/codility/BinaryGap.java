package org.example.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
    public int solution(int N) {
        // Implement your solution here
        List<Integer> binary = new ArrayList<>();
        while (N != 0) {
            if (N%2 != 0) {
                binary.add(1);
            } else {
                binary.add(0);
            }
            N = N/2;
        }
        List<Integer> gapList = new ArrayList<>();
        int oneCnt = Collections.frequency(binary, 1);
        System.out.println(oneCnt);
        if(oneCnt ==1) {
            return 0;
        } else {
            int gap = 0;
            for (int i : binary) {
                if (i == 0) {
                    gap++;
                } else {
                    gapList.add(gap);
                    gap = 0;
                }
            }
            System.out.println(gapList);
            return Collections.max(gapList);
        }
    }
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        binaryGap.solution(32);
    }
}
