package level1;

import java.util.Arrays;

public class ArrangeInteger {

    class Solution {
        public long solution(long n) {
            long answer = 0;
            // long값인 n을 String으로 변경하여 배열에 한글자씩(split) 담음
            String[] array = String.valueOf(n).split("");

            // 오름차순 정렬
            Arrays.sort(array);

            // 내림차순 정렬
            String str = "";
            for (int i = array.length - 1; i >= 0; i--) {
                str += array[i];
            }

            // long형으로 변환
            answer = Long.parseLong(str);
            return answer;
        }
    }
}
