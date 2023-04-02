package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class TestExample {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        class Solution {
            public int[] solution(int[] answers) {
                ArrayList<Integer> answerList = new ArrayList<>();
                int[] tempB = new int[]{1, 3, 4, 5};
                int[] tempC = new int[]{3, 1, 2, 4, 5};
                for (int i = 0; i < answers.length; i++) {
                    int tempAnswer = answers[i];
                    if (((i % 5) + 1) == tempAnswer) {
                        map.put(1, map.getOrDefault(1, 0) + 1);
                    }
//                    System.out.println(tempAnswer + "-" + ((i % 5) + 1) + "====" + map.getOrDefault(1, 0));
                    if (((i + 1) % 2) - 1 == 0) {
                        if (tempAnswer == 2) {
                            map.put(2, map.getOrDefault(2, 0) + 1);
                        }
                        System.out.println(tempAnswer + "-" + 2 + "====" + (map.getOrDefault(2, 0)));
                    } else {
                        if (tempB[((i / 2) % tempB.length)] == tempAnswer) {
                            map.put(2, map.getOrDefault(2, 0) + 1);
                        }
                        System.out.println(tempAnswer + "-" + (tempB[((i / 2) % tempB.length)]) + "====" + (map.getOrDefault(2, 0)));
                    }

//
                    if (tempC[((i / 2) % 5)] == tempAnswer) {
                        map.put(3, map.getOrDefault(3, 0) + 1);
                    }
//                    System.out.println(tempAnswer + "-" + (tempC[((i / 2) % 5)]) + "====" + (map.getOrDefault(3, 0)));

                }
                int max = 0;


                for (Map.Entry<Integer, Integer> set : map.entrySet()) {
                    System.out.println("set :" + set.getKey() + "-" + set.getValue());
                    if (max <= set.getValue()) {
                        max = set.getValue();
                        answerList.add(set.getKey());
                    }
                }

                int count = 0;
                int[] answer = new int[answerList.size()];
                for (int i : answerList) {
                    answer[count] = i;
                    count++;
                }

                return answer;
            }
        }
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 4, 5, 1, 2, 2, 2, 2, 2, 2, 2, 4, 4, 5, 5, 4, 1, 2, 4, 5, 1, 1, 4, 4, 1, 1, 2, 2, 4, 4, 4, 1};
        Solution s = new Solution();
        int[] result = s.solution(arr);
        for (int i : result) {
            System.out.println("reulst : " + i);
        }
    }
}
