package etc_exam;

public class SecondStock {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] prices) {
                int[] answer = new int[prices.length];
                for (int i = 0; i < prices.length; i++) {
                    int count = 0;
                    for (int j = i + 1; j < prices.length; j++) {
                        count++;
                        if (prices[i] > prices[j]) {
                            break;
                        }
                    }
                    answer[i] = count;
                }
                for (int i = 0; i< answer.length; i++) {
                    System.out.println(answer[i]);
                }
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{1, 2, 3, 2, 3});
    }
}
