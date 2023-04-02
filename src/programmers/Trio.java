package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trio {
    public static void main(String[] args) {
        class Solution {
            public List<int[]> combination(int[] nums, int k) {
                List<int[]> res = new ArrayList<>();
                backtrack(nums, k, res, new ArrayList<>(), 0);
                return res;
            }

            private void backtrack(int[] nums, int k, List<int[]> res, List<Integer> temp, int start) {
                if (temp.size() == k) {
                    int[] arr = new int[k];
                    for (int i = 0; i < k; i++) {
                        arr[i] = temp.get(i);
                    }
                    res.add(arr);
                } else {
                    for (int i = start; i < nums.length; i++) {
                        temp.add(nums[i]);
                        backtrack(nums, k, res, temp, i + 1);
                        temp.remove(temp.size() - 1);
                    }
                }
            }

            public int solution(int[] number) {
                int answer = 0;
                Arrays.sort(number);
                for (int k = 0; k < number.length; k++) {
                    System.out.println("----" + number[k] + "----");
                    for (int i = k + 1; i < number.length; i++) {
                        int temp = number[k] + number[i];
                        for (int j = number.length - 1; j > i; j--) {
                            System.out.println("####   " + number[k] + ", " + number[i] + ", " + number[j] + "  ####");
                            int sum = temp + number[j];
                            if (sum == 0) {
                                System.out.println("++++++");
                                answer++;
                            } else if (sum < 0) {
                                break;
                            }
                        }
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();
        int[] arr = new int[]{-3, -2, -1, 0, 1, 2, 3};
//        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(s.solution(arr));
    }
}
