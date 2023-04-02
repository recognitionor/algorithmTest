package programmers;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12909*/
public class ValidBracket {
    public static void main(String[] args) {
        class Solution {
            boolean solution(String s) {
                if (s.charAt(0) == ')') {
                    return false;
                }
                if (s.charAt(s.length() - 1) == '(') {
                    return false;
                }
                if ((s.length() % 2) == 1) {
                    return false;
                }
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '(') {
                        count++;
                    } else {
                        count--;
                    }
                    if (count < 0) {
                        return false;
                    }
                }
                return count == 0;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution("(()("));
    }
}
