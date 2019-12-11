package ch.patbrant.interviewquestions.listreverse;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListReverserTest {

    @Test
    public void reverseList() {
        List<String> input = Arrays.asList("Sarah", "Thomas", "Peter", "Julia");
        List<String> reversedList = ListReverser.reverseList(input);

        Assert.assertEquals("haraS", reversedList.get(0));
        Assert.assertEquals("samohT", reversedList.get(1));
        Assert.assertEquals("reteP", reversedList.get(2));
        Assert.assertEquals("ailuJ", reversedList.get(3));
    }
}
