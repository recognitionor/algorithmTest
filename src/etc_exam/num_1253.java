package etc_exam;

import java.util.HashMap;
import java.util.HashSet;

public class num_1253 {
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] canWord = {"aya", "ye", "woo", "ma"};

            boolean[] t = new boolean[canWord.length];
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < canWord.length; i++) {
                combination(canWord, t, 0, 4, i, set);
            }
            for (String str : set) {
                System.out.println(str);
            }

            for (String str : babbling) {
                if (set.contains(str)) {
                    answer++;
                }
            }
            return answer;
        }
    }

    static String createString(String[] arr, boolean[] visited, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }

    static HashSet<String> combination(String[] arr, boolean[] visited, int start, int n, int r, HashSet<String> set) {
        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    set.add(createString(arr, visited, n));
                    return set;

                }
            }
            return set;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, set);
            visited[i] = false;
        }
        return set;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result = s.solution(babbling);
        System.out.println("" + result);
    }
}
