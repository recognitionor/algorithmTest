package programmers;

/* https://school.programmers.co.kr/learn/courses/30/lessons/120924*/
public class NextNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] common) {
                int answer = 0;
                int temp = common[2] - common[1];
                if (temp == (common[1] - common[0])) {
                    System.out.println("등차");
                    answer = temp + common[common.length - 1];
                    // 등차
                } else {
                    // 등비
                    System.out.println("등비");
                    temp = common[2] / common[1];
                    answer = temp * common[common.length - 1];
                }
                System.out.println(temp);
                return answer;
            }
        }
        Solution s = new Solution();
        int[] arr = new int[]{2, 4, 8};
        System.out.println("result : " + s.solution(arr));
    }
}
