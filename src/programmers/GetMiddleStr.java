package programmers;

public class GetMiddleStr {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = s;
                int index;
                if (s.length() % 2 == 1) {
                    index = s.length() / 2;
                    answer = answer.substring(index, index + 1);
                } else {
                    index = s.length() / 2;
                    answer = answer.substring(index - 1, index + 1);
                }
                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution("sexy"));
    }
}
