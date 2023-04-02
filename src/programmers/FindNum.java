package programmers;

public class FindNum {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num, int k) {
                int answer = -1;
                String numStr = String.valueOf(num);
                int length = String.valueOf(num).length();
                for (int i = 0; i < numStr.length(); i++) {
                    String test = numStr.substring(i, i + 1);
                    if (Integer.valueOf(test) == k) {
                        answer = i + 1;
                        break;
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(123456, 7));
    }
}
