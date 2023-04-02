package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MakePrimeNumber {
    public static void main(String[] args) {
        class Solution {

            public boolean isPrime(int n) {
                for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }

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

            public int solution(int[] nums) {
                int answer = 0;
                List<int[]> list = combination(nums, 3);
                for (int[] arr : list) {
                    int sum = arr[0] + arr[1] + arr[2];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 7, 6, 4};
    }
}
