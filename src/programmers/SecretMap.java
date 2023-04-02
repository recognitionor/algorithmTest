package programmers;

public class SecretMap {
    public static void main(String[] args) {
        class Solution {

            public String[] solution(int n, int[] arr1, int[] arr2) {
                String[] answer = new String[n];
                long[] arrA = new long[n];
                long[] arrB = new long[n];
                long[] result = new long[n];
                for (int i = 0; i < n; i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        boolean tempA = String.format("%" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i]))).charAt(j) == '1';
                        boolean tempB = String.format("%" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i]))).charAt(j) == '1';
                        if (tempA || tempB) {
                            sb.append("#");
                        } else {
                            sb.append(" ");
                        }
                    }
                    System.out.println(sb.toString());
                    answer[i] = sb.toString();
                }
                return answer;
            }
        }

        Solution s = new Solution();
//        int[] arr = new int[]{9, 20, 28, 18, 11};
//        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        int[] arr = new int[]{46, 33, 33, 22, 31, 50};
        int[] arr2 = new int[]{27, 56, 19, 14, 14, 10};


        s.solution(6, arr, arr2);
    }
}
