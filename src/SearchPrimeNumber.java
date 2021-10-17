import java.util.ArrayList;
import java.util.HashSet;

public class SearchPrimeNumber {
    public static void main(String[] args) {
        class Solution {

            private boolean checkPrimeNum(int num) {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) return false;
                }
                return true;

            }

            public int solution(String numbers) {
                int answer = 0;
                ArrayList<Integer> list = new ArrayList<>();
                int numberLength = numbers.length();
                int array[] = new int[numberLength];
                int arrayT[] = new int[numberLength];

                for (int i = 0; i < numberLength; i++) {
                    array[i] = Integer.valueOf(numbers.substring(i, i + 1));
                    list.add(Integer.valueOf(numbers.substring(i, i + 1)));
                }
                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < array.length ; i++) {
                    for (int j = array.length -1; j >= 0; j--) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        for (int t : array) {
                            System.out.println(t);
                        }
                        System.out.println("-------");
                    }
                }
//
//                for (int t : list) {
//                    System.out.println(t);
//                }
//                while (numberLength > 0) {
//                    for (int i = 0; i < numberLength; i++) {
//
//                    }
//                    numberLength--;
//
//                }

                return answer;
            }


        }
        Solution s = new Solution();
        s.solution("172");
    }
}
