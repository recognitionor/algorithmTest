package etc_exam;

import java.util.Arrays;
import java.util.Comparator;

public class SearchMaxNumber {
    public static void main(String[] args) {
        class Solution {
            public String solution(int[] numbers) {
                String answer = "";

                String[] strArr = new String[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    strArr[i] = String.valueOf(numbers[i]);
                }
                Arrays.sort(strArr, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return (o2 + o1).compareTo(o1 + o2);
                    }
                });

                if (strArr[0].equals("0")) return "0";

                for (int i = 0; i < strArr.length; i++) {
                    answer+=strArr[i];
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{3, 30, 34, 5, 9});
    }
}
