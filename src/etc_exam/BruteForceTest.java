package etc_exam;

import java.util.ArrayList;

public class BruteForceTest {


    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] answers) {
                int[] answer = {};
                int correctCount1 = 0;
                for (int i = 0; i < answers.length; i++) {
                    int num = (i % 5) + 1;
                    if (num == answers[i]) {
                        correctCount1++;
                    }
                }
                System.out.println(correctCount1);

                int correctCount2 = 0;
                int[] pattern = new int[]{1, 3, 4, 5};
                int arrIndex = 0;
                for (int i = 0; i < answers.length; i++) {
                    int num = 0;
                    if ((i + 1) % 2 == 1) {
                        num = 2;
                    } else {
                        num = pattern[arrIndex % pattern.length];
                        arrIndex++;
                    }
                    if (num == answers[i]) {
                        correctCount2++;
                    }
                }
                System.out.println(correctCount2);

                int correctCount3 = 0;
                int[] pattern2 = new int[]{3, 1, 2, 4, 5};

                for (int i = 0; i < answers.length; i++) {
                    int num = 0;
                    if (i == 0) {
                        num = 0;
                    } else {
                        num = (i % pattern2.length) / 2;
                    }

                    if (answers[i] == pattern2[num]) {
                        correctCount3++;
                    }
                }

                int[] result = new int[]{correctCount1, correctCount2, correctCount3};
                int max = 0;
                for (int i = 0; i < result.length; i++) {
                    if (max < result[i]) {
                        max = result[i];
                    }
                }

                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < result.length; i++) {
                    if (result[i] == max) {
                        list.add(i + 1);
                    }
                }
                answer = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }

                System.out.println(correctCount3);

                return answer;
            }
        }

        System.out.println("test");
        Solution s = new Solution();
        s.solution(new int[]{1, 2, 3, 4, 5});

    }
}
