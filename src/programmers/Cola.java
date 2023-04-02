package programmers;

/*https://school.programmers.co.kr/learn/courses/30/lessons/132267*/
public class Cola {
    public static void main(String[] args) {
        class Solution {
            public int solution(int a, int b, int n) {
                int answer = 0;
                while (n >= a) {
                    System.out.println("a : " + a + ", b : " + b + ", n : " + n);
                    int temp;
                    temp = (n / a) * b;
                    answer += temp;
                    System.out.println("temp : " + temp);
                    System.out.println("answer : " + answer);
                    System.out.println("(n % a) : " + (n % a));
                    n = temp + (n % a);
                    System.out.println("post : " + n);
                }

                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(3, 2, 4));

    }
}
