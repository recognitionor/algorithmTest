import java.util.HashSet;

public class Babbling {
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] canWord = new String[]{"aya", "ye", "woo", "ma"};

            for (String babblingWord : babbling) {
                for (String word : canWord) {
                    while (babblingWord.startsWith(word)) {
                        System.out.println(word + "---" + babblingWord);
                        babblingWord = babblingWord.substring(word.length());
                        if (babblingWord.length() < 1) {
                            System.out.println(word + "###" + babblingWord);
                            answer++;
                        }
                    }
                }

            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        int result = s.solution(babbling);
        System.out.println("" + result);

    }
}
