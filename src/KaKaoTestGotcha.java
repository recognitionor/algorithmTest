import java.util.Stack;

public class KaKaoTestGotcha {


    public static void main(String[] args) {
        class Solution {
            public int solution(int[][] board, int[] moves) {
                System.out.println("solution");

                Stack<Integer> stack = new Stack<>();
                int answer = 0;
                for (int i = 0; i < moves.length; i++) {
                    int crainTarget = moves[i] - 1;
                    int searchIndex = 0;

                    while (true) {
                        int pickItem = board[searchIndex][crainTarget];
                        if (pickItem != 0) {
                            if (!stack.isEmpty() && stack.peek() == pickItem) {
                                answer += 2;
                                stack.pop();
                            } else {
                                stack.push(pickItem);
                            }
                            board[searchIndex][crainTarget] = 0;
                            break;
                        } else {
                            searchIndex++;
                        }
                        if (searchIndex >= board.length) {
                            break;
                        }
                    }
                }

                System.out.println(answer);

                return answer;
            }
        }

        Solution s = new Solution();
        int[][] array4 = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        s.solution(array4, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }
}
