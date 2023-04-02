package programmers;

public class AntCorps {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int generalAnt = 5;
                int soldierAnt = 3;
                int workAnt = 1;
                if (n >= generalAnt) {
                    answer = answer + (n / generalAnt);
                    n = (n % generalAnt);
                }
                if (n >= soldierAnt) {
                    answer = answer + (n / soldierAnt);
                    n = (n % soldierAnt);
                }
                answer = answer + n;

                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(999));
    }
}
