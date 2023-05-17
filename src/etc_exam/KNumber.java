package etc_exam;

import java.util.ArrayList;
import java.util.Comparator;

public class KNumber {

    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] array, int[][] commands) {
                int[] answer = new int[commands.length];
                for (int i = 0; i < commands.length; i++) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                        list.add(array[j]);
                    }

                    list.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o1 > o2 ? 1 : -1;
                        }
                    });
                    answer[i] = list.get(commands[i][2] - 1);
                }

                for (int t : answer) {
                    System.out.println(t);
                }

                return answer;

            }
        }
        Solution s = new Solution();
        s.solution(new int[]

                {
                        1, 5, 2, 6, 3, 7, 4
                }, new int[][]

                {
                        {
                                2, 5, 3
                        },
                        {
                                4, 4, 1
                        },
                        {
                                1, 7, 3
                        }
                });
    }
}