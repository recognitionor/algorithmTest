package programmers;

import java.util.Arrays;
import java.util.ArrayList;

public class H_Index {


    public static void main(String[] args) {
        class Solution {
            public int solution(int[] citations) {
                int answer = 0;
                ArrayList<Integer> list = new ArrayList<>();
                Arrays.sort(citations);
                for (int i = 0; i < citations.length; i++) {
                    int h = citations.length - i;
                    if (citations[i] >= h) {
                        answer = h;
                        break;
                    }
                }

                return answer;
            }
        }

        Solution s = new Solution();
        int[] arr = new int[]{0, 0, 0, 2, 1};
        int result = s.solution(arr);
        System.out.println(result);
    }
}
