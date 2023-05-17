package etc_exam;

public class ReceiverTop {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] heights) {
                int[] answer = new int[heights.length];
                for (int i = heights.length - 1; i >= 0; i--) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (heights[j] > heights[i]) {
                            answer[i] = j + 1;
                            break;
                        }
                    }

                }

                return answer;
            }
        }

        Solution s = new Solution();
        s.solution(new int[]{6, 9, 5, 7, 4});

    }
}
