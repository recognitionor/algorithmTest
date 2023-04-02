package programmers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class targetNumber {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] numbers, int target) {
                int answer = 0;
                try {
                    HttpURLConnection conn = (HttpURLConnection) new URL("").openConnection();
                    conn.disconnect();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                return answer;
            }
        }
        Solution s = new Solution();
//        s.solution()
    }
}
