package level1;

public class Nnumbers {

    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long [n]; // 자연수 n이 배열의 수
            for(int i = 0; i < n; i++) {
                answer[i] = (long)x*(i+1);
            }
            return answer;
        }
    }
}
