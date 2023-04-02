package programmers;

import java.util.*;

public class Fatigue {
    public static void main(String[] args) {

        class Solution {
            private static int answer;
            private static boolean visited[];

            public static int solution(int k, int[][] dungeons) {
                answer = 0;
                visited = new boolean[dungeons.length];
                dfs(0, k, dungeons, 0);
                return answer;
            }


            public static void dfs(int depth, int k, int[][] dungeons, int ans) {
                System.out.println("ans :" + ans);
                System.out.println("answer :" + answer);
                if (depth >= dungeons.length) {
                    if (ans > answer) {
                        answer = ans;
                    }
                }

                for (int i = 0; i < dungeons.length; i++) {
                    System.out.println("i :" + i);
                    System.out.println("depth: " + depth);
                    System.out.println("k :" + k);
                    if (visited[i]) {
                        continue;
                    }
                    visited[i] = true;
                    if (k >= dungeons[i][0]) {
                        dfs(depth + 1, k - dungeons[i][1], dungeons, ans + 1);
                    } else {
                        dfs(depth + 1, k, dungeons, ans);
                    }
                    visited[i] = false;
                }
            }
        }
        Solution s = new Solution();
        int[][] arr = new int[][]{{1, 1}, {2, 1}, {3, 2}};
        System.out.println(s.solution(3, arr));
    }
}
