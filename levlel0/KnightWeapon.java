package levlel0;


class Soulution {
    public int soulution(int number, int limit, int power) {
        int answer = 0;
        // 기사들의 약수 번호 구하기
        for (int i = 1; i <= number; i++) {
            int cnt = 0; // 약수의 갯수
            for (int j = 1; j*j <= i; j++) { //제곱근 구하기
                if(j*j==i) cnt++;
                else if (i%j==0) cnt += 2;
            }
            if(cnt>limit) cnt = power;
            answer += cnt;

        }
        return answer;
    }
}