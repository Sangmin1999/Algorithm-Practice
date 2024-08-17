package level1;

import java.util.Arrays;

public class ThatFallApart {

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0) // 나눠 떨어지는 것을 필터
                    .sorted() // 오름차순 정렬
                    .toArray(); // 배열로 전환
            if (answer.length == 0) {
                answer = new int[]{-1};
            }
            return answer;
        }
    }
}
