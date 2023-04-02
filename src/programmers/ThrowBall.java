package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/120843
public class ThrowBall {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers, int k) {
                int answer = 0;
                int count = 0;
                for (int i = 1; i < k; i++) {
                    System.out.println(i);
                    count += 2;
                    System.out.println("**" + count);
                    System.out.println("--" + count % numbers.length );
                    answer = numbers[count % numbers.length];
                    System.out.println("answer" + answer);

                }
                return answer;
            }
        }
        Solution s = new Solution();
        int[] numArr = new int[]{1, 2, 3};
        System.out.println(s.solution(numArr, 3));
    }
}
