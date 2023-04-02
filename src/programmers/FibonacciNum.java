package programmers;

public class FibonacciNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                long answer = 0;
                long p1 = 0;
                long p2 = 1;
                long p3 = 0;

                for (int i = 1; i < n; i++) {
                    p3 = p1 + p2;
                    p1 = p2;
                    p2 = p3;
//                    System.out.println("p1 : " + p1);
//                    System.out.println("p2 : " + p2);
//                    System.out.println("p3 : " + p3);
                }
                answer = p3 % 1234567;
                return (int) answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(5));
    }
}
