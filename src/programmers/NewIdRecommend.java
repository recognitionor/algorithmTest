package programmers;

import java.util.Locale;

/*https://school.programmers.co.kr/learn/courses/30/lessons/72410*/
public class NewIdRecommend {

    public static void main(String[] args) {
        class Solution {
            public boolean isNumeric(String str) {
                try {
                    Double.parseDouble(str);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }

            public String solution(String new_id) {
                String answer = "";
                // 1
                new_id = new_id.toLowerCase(Locale.ROOT);
                System.out.println("1 : " + new_id);
                //2

                for (int i = 0; i < new_id.length(); i++) {
                    char c = new_id.charAt(i);
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || isNumeric(String.valueOf(c)) || c == '-' || c == '.' || c == '_') {
                        continue;
                    } else {
                        new_id.replaceAll(String.valueOf(c), "");
                    }
                }

                System.out.println("2 : " + new_id);

                return answer;
            }
        }
        Solution s = new Solution();
        s.solution("...!@BaT#*..y.abcdefghijklm");

    }
}
