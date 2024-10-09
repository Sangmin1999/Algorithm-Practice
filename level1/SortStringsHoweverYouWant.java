package level1;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsHoweverYouWant {

    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings);
            Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
            return strings;
        }
    }
}
