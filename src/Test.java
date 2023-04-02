import kotlin.jvm.Throws;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] lottos, int[] win_nums) {
                int maxResult = 0;
                int minResult = 0;
                for (int i = 0; i < win_nums.length; i++) {
                    if (win_nums[i] == lottos[i]) {
                        maxResult++;
                        minResult++;
                    } else {
                        if (lottos[i] == 0) {
                            maxResult++;
                        }
                    }
                }

                int[] answer = {maxResult, minResult};
                System.out.println(maxResult);
                System.out.println(minResult);
                return answer;
            }
        }

        Solution s = new Solution();
        int[] lottos = new int[]{44, 1, 0, 0, 31, 25};
        int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
        s.solution(lottos, win_nums);
    }
}
