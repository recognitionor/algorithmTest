package etc_exam;

public class PrinterTest {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] priorities, int location) {
                int answer = 0;
                int[] tempArr = priorities.clone();
                int targetIndex = 0;
                for (int i = 0; i < tempArr.length - 1; i++) {
                    for (int j = i + 1; j < tempArr.length; j++) {
                        if (tempArr[i] < tempArr[j]) {
                            int temp = tempArr[i];
                            tempArr[i] = tempArr[j];
                            tempArr[j] = temp;

                        }
                    }
                    if (i == location) {
                    }
                }

                for (int t : priorities) {
                    System.out.println(t);
                }
                for (int t : tempArr) {
                    System.out.println(t);
                }
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{2, 1, 3, 2}, 2);

    }
}
