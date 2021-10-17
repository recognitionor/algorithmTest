import java.util.HashSet;
import java.util.LinkedList;

public class TargetNumber {
    //순열
    private static void permutation(HashSet<boolean[]> plusSet, int[] arr, LinkedList<Integer> list, int[] check, int r) {
        if (list.size() == r) {
            boolean[] set = new boolean[arr.length];
            for (int i : list) {
                set[i] = true;
                System.out.println(i);
            }
            plusSet.add(set);
            System.out.println("--------");

            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (check[i] == 0) {
                check[i] = 1;
                list.add(i);
                permutation(plusSet, arr, list, check, r);
                list.removeLast();
                check[i] = 0;
            }
        }

    }

    public static void main(String[] args) {

        class Solution {

            private int dfs(int[] numbers, int node, int sum, int target) {
                if (node == numbers.length) {
                    if (sum == target)
                        return 1;
                    return 0;
                }
                return dfs(numbers, node + 1, sum + numbers[node], target)
                        + dfs(numbers, node + 1, sum - numbers[node], target);
            }

            public int solution(int[] numbers, int target) {
                int answer = 0;
                answer = dfs(numbers, 0, 0, target);
                System.out.println(answer);
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution(new int[]{1, 1, 1}, 3);
    }
}
