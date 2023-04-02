package programmers;

/*https://school.programmers.co.kr/learn/courses/30/lessons/12901*/

import java.util.*;

public class _2016 {


    public static void main(String[] args) {
        class Solution {

            public String solution(int a, int b) {
                String[] week = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
                String answer = "";
                int day = 0;
                for (int i = 2; i <= a; i++) {
                    switch (i) {
                        case 2, 4, 6, 8, 9, 11 -> {
                            day += 31;
                        }
                        case 3 -> {
                            day += 29;
                        }
                        case 5, 7, 10, 12 -> {
                            day += 30;
                        }
                    }
                }
                day += (b - 1);
                System.out.println("day : " + day);
                answer = week[(day % 7)];

                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution(2, 1));
//        System.out.println(s.solution(1, 2));
//        System.out.println(s.solution(1, 3));
//        System.out.println(s.solution(1, 4));
//        System.out.println(s.solution(1, 5));
//        System.out.println(s.solution(1, 6));
//        System.out.println(s.solution(1, 7));
    }

}
