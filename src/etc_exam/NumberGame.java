package etc_exam;

import java.util.ArrayList;

public class NumberGame {


    static int partition(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];
        while (start <= end) {
            while (array[start] < pivot) start++;
            while (array[end] > pivot) end--;
            if (start <= end) {
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }


    static int[] quickSort(int[] array, int start, int end) {
        int p = partition(array, start, end);
        if (start < p - 1) quickSort(array, start, p - 1);
        if (p < end) quickSort(array, p, end);
        return array;
    }

    public static void main(String[] args) {
        class Solution {

            public int solution(int[] A, int[] B) {
                int answer = 0;
                A = quickSort(A, 0, A.length - 1);
                B = quickSort(B, 0, B.length - 1);
                ArrayList<Integer> popAList = new ArrayList();
                ArrayList<Integer> popBList = new ArrayList();

                for (int i = 0; i < B.length; i++) {
                    if (!popBList.contains(i)) {
                        for (int j = 0; j < A.length; j++) {
                            if (!popAList.contains(j)) {
                                if (B[i] > A[j]) {
                                    popBList.add(i);
                                    popAList.add(j);
                                    answer++;
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{5, 1, 3, 7}, new int[]{2, 2, 6, 8});

    }
}
