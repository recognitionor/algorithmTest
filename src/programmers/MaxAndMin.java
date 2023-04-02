package programmers;

import java.util.*;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12939 */
public class MaxAndMin {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s) {
                String answer = "";
                String strArr[] = s.split(" ");

                System.out.println(s);
                ArrayList<Integer> list = new ArrayList<>();
                boolean isNegative = false;
                for (String value : strArr) {
                    list.add(Integer.parseInt(value));
                }
                Collections.sort(list);
                answer = list.get(0) + " " + list.get(list.size() - 1);

                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution("-1 0 1"));
    }
}
