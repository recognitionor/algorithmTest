package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MakeMinValue {
    /*https://school.programmers.co.kr/learn/courses/30/lessons/12939*/
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] A, int[] B) {
                int answer = 0;
                ArrayList<Integer> listA = new ArrayList<>();
                ArrayList<Integer> listB = new ArrayList<>();
                for (int i = 0; i < A.length; i++) {
                    listA.add(A[i]);
                    listB.add(B[i]);
                }

                Collections.sort(listA);
                Collections.sort(listB, Collections.reverseOrder());

                for (int i = 0; i < listB.size(); i++) {
                    answer += listA.get(i) * listB.get(i);
                }
                System.out.println(answer);

                return answer;
            }
        }
        Solution s = new Solution();
        int[] arr1 = new int[]{1, 4, 2};
        int[] arr2 = new int[]{5, 4, 4};
        s.solution(arr1, arr2);
    }
}
