package level1;

public class ColatzGuess {
    class Solution {
        public int solution(long num) {
            int answer = 0;

            while (num != 1) {
                if (num % 2 == 0)
                   num = num / 2;
                 else
                   num = num * 3 + 1;
                    answer++; // 횟수를 구하기 위해 점차 증가

                if (answer >= 500) {
                    answer = -1;
                    break;
                }
            }
            return answer;
        }
    }
}
