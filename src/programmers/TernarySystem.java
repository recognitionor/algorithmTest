package programmers;

public class TernarySystem {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                String tempStr = Integer.toString(n, 3);
                StringBuilder reverse = new StringBuilder();
                System.out.println(tempStr);
                for (int i = tempStr.length() - 1; i >= 0; i--) {
                    reverse.append(tempStr.charAt(i));
                }
                ;
                return Integer.parseInt(reverse.toString(),3);
            }
        }
        Solution s = new Solution();
        s.solution(445);
    }
}
