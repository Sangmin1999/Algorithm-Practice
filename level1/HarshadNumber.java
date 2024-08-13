package level1;

public class HarshadNumber {

    class Solution {
        public boolean solution(int x) {
            int num = x;
            int sum = 0;
            boolean answer = true;

            while (num > 0) {
                sum += num%10;
                num /= 10;
            }
            if (x % sum != 0) {
                answer = false;
            }
            return answer;
        }
    }
}
