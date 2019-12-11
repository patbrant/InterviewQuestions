package ch.patbrant.interviewquestions.distancefinder;

import java.util.List;

public class MinDistanceFinder {
    public static int distClosesNumber(List<Integer> inputList) {

        int minResult = Integer.MAX_VALUE;
        for (int minuend : inputList) {
            for (int subtrahend : inputList) {
                if (minuend == subtrahend) {
                    continue;
                }
                int actualResult = Math.abs(minuend - subtrahend);
                if (actualResult < minResult) {
                    minResult = actualResult;
                }
            }
        }
        return minResult;
    }
}
