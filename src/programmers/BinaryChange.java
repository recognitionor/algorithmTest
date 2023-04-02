package programmers;

/*https://school.programmers.co.kr/learn/courses/30/lessons/70129*/
public class BinaryChange {
    public static void main(String[] args) {
        class Solution {

            public int[] solution(String s) {
                int[] answer = new int[]{0, 0};


                while (!s.equals("1")) {

                    String temp = s.replace("0", "");
                    answer[0]++;
                    answer[1] += s.length() - temp.length();

                    s = Integer.toBinaryString(temp.length());
                }
                return answer;
            }
        }
        Solution s = new Solution();
        int[] result = s.solution("110010101001");
        for (int i : result) {
            System.out.println(i);
        }

    }
}
