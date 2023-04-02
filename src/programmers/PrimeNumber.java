package programmers;

public class PrimeNumber {
    public static void main(String[] args) {
        class Solution {
            public boolean isPrime(int n) {
                for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }

            public int solution(int n) {
                int answer = 0;
                for (int i = 2; i <= n; i++) {
                    if (isPrime(i)) {
                        answer++;
                    }
                    System.out.println(i);
                }

                return answer;
            }
        }

        Solution s = new Solution();
        System.out.println(s.solution(10));

    }
}
