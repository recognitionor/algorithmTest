package programmers;

public class CesarCode {
    public static void main(String[] args) {
        class Solution {
            public String solution(String s, int n) {
                String answer = "";
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ' ') {
                        sb.append(' ');
                        continue;
                    }
                    int asciiNum = s.charAt(i);
                    System.out.println(asciiNum);
                    if (asciiNum >= 65 && asciiNum <= 90) {
                        int tempIndex = (asciiNum + n);
                        char ch = ((char) (((tempIndex - 65) % 26) + 65));
                        sb.append(ch);
                        System.out.println(ch);
                    } else {
                        int tempIndex = (asciiNum + n);
                        char ch = ((char) (((tempIndex - 97) % 26) + 97));
                        sb.append(ch);
                        System.out.println(ch);
                    }
                }
                answer = sb.toString();
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution("a B z", 1);
    }
}
