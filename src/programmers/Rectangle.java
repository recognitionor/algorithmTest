package programmers;

import java.util.Arrays;

public class Rectangle {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] sizes) {
                int answer = 0;
                int maxCol = 0;
                int maxRow = 0;
                for (int i = 0; i < sizes.length; i++) {
                    Arrays.sort(sizes[i]);
                    if (maxCol < sizes[i][0]) {
                        maxCol = sizes[i][0];
                    }
                    if (maxRow < sizes[i][1]) {
                        maxRow = sizes[i][1];
                    }
                }
                answer = maxCol * maxRow;
                return answer;
            }
        }
        Solution s = new Solution();
        int[][] arr = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        s.solution(arr);
    }
}
