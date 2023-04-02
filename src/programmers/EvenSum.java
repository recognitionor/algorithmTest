package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/120831

public class EvenSum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                for (int i = 0; i <= n; i++) {
                    if (i == 0) {
                        continue;
                    }
                    if ((i % 2) == 0) {
                        answer += i;
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }
}
