package programmers;

public class CurseNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                // n까지 반복
                for (int i = 1; i <= n; i++) {
                    // i에 증가에 따른 x3의 증가
                    answer++;
                    // 3이 들어가지 않으며, 3의 배수 또한 아닌 경우까지 반복
                    while (String.valueOf(answer).contains("3") || answer % 3 == 0) {
                        answer++;
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();

        for (int i = 0; i <= 15; i++) {
            System.out.println("result  " + i + " : " + s.solution(i));
        }


    }
}
