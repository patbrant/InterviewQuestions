package ch.patbrant.interviewquestions.listreverse;

import java.util.List;
import java.util.stream.Collectors;

public class ListReverser {

    public static List<String> reverseList(List<String> list) {
        return list.stream()
                .map(ListReverser::reverseString)
                .collect(Collectors.toList());
    }

    private static String reverseString(String string) {
        String reversed = "";
        for (char c : string.toCharArray()) {
            reversed = c + reversed;
        }
        return reversed;
    }
}
