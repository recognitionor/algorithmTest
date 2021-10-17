import java.util.HashSet;
import java.util.LinkedList;

public class Search_1 {

    private static boolean isPrime(int num) {
        if (num == 1 || num == 0 ) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //순열
    private static void permutation(HashSet<Integer> result, int[] arr, LinkedList<Integer> list, int[] check, int r) {
        if (list.size() == r) {
            StringBuilder index = new StringBuilder();
            for (int i : list) {
                index.append(i);
            }
            result.add(Integer.valueOf(index.toString()));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (check[i] == 0) {
                check[i] = 1;
                list.add(arr[i]);
                permutation(result, arr, list, check, r);
                list.removeLast();
                check[i] = 0;
            }
        }

    }

    public static void main(String[] args) {
        class Solution {
            public int solution(String numbers) {
                int answer = 0;
                int[] arr = new int[numbers.length()];
                HashSet<Integer> numSet = new HashSet<>();
                int[] check = new int[numbers.length()];
                for (int i = 0; i < numbers.length(); i++) {
                    arr[i] = Integer.valueOf(numbers.substring(i, i + 1));
                    numSet.add(arr[i]);
                    check[i] = 0;
                }

                for (int i = 1; i <= arr.length; i++) {
                    permutation(numSet, arr, new LinkedList<Integer>(), check, i);
                }

                for (int t : numSet) {
//                    System.out.println(t);
                    if (isPrime(t)) {
                        answer++;
                    }
                }
                System.out.println(answer);

                return answer;
            }
        }

        Solution s = new Solution();
        s.solution("17");
    }
}
