package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EmptyNumberSum {


    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers) {
                int answer = 0;
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < numbers.length; i++) {
                    set.add(numbers[i]);
                }
                for (int i = 0; i < 10; i++) {
                    if (!set.contains(i)) {
                        answer += i;
                    }
                }
                return answer;
            }
        }

        int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        Solution s = new Solution();
        System.out.println(s.solution(arr));

    }
}
