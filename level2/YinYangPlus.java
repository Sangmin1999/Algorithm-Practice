package level2;

public class YinYangPlus {

    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 123456789;
            int result = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i] == true) {
                    absolutes[i] = absolutes[i];
                    result += absolutes[i];
                } else {
                    absolutes[i] = -absolutes[i];
                    result += absolutes[i];
                }
                answer = result;
            }
            return answer;
        }
    }
}
