package ch.patbrant.interviewquestions.distancefinder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinDistanceFinderTest {

    @Test
    public void testDistClosesNumbers() {
        List<Integer> input = Arrays.asList(3, 9, 50, 15, 99, 7, 98, 65);
        int result = MinDistanceFinder.distClosesNumber(input);

        Assert.assertEquals(99 - 98, result);
    }

}
