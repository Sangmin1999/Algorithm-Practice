package levlel0;

public class AgeOutput {
    class Solution {
        public int solution(int age) {
            int answer = 0;
            if (age > 0 && age <= 120) {
                answer = 2023 - age;
            }
            return answer;
        }
    }
}
