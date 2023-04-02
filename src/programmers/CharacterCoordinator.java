package programmers;

public class CharacterCoordinator {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(String[] keyinput, int[] board) {
                int[] answer = new int[2];
                int colMax = (board[0] / 2);
                int rowMax = (board[1] / 2);
                System.out.println("rowMax : " + rowMax);
                System.out.println("colMax : " + colMax);
                for (String direction : keyinput) {
                    switch (direction) {
                        case "left" -> {
                            System.out.println("pre left : " + answer[0]);
                            int temp = answer[0] - 1;
                            if (Math.abs(temp) <= colMax) {
                                answer[0]--;
                                System.out.println("left : " + answer[0]);
                            }
                        }
                        case "right" -> {
                            System.out.println("pre right : " + answer[0]);
                            int temp = answer[0] + 1;
                            if (Math.abs(temp) <= colMax) {
                                answer[0]++;
                                System.out.println("right : " + answer[0]);
                            }
                        }
                        case "up" -> {
                            System.out.println("pre up : " + answer[1]);
                            int temp = answer[1] + 1;
                            if (Math.abs(temp) <= rowMax) {
                                answer[1]++;
                            }
                            System.out.println("up : " + answer[1]);
                        }
                        case "down" -> {
                            System.out.println("pre down : " + answer[1]);
                            int temp = answer[1] - 1;
                            if (Math.abs(temp) <= rowMax) {
                                answer[1]--;
                            }
                            System.out.println("down : " + answer[1]);
                        }
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();

//        String[] keyInput = new String[]{"left", "left", "left", "left", "right", "right", "right", "right"};
//        int[] board = new int[]{5, 5};
//        String[] keyInput = new String[]{"left", "right", "up", "right", "right"};
//        int[] board = new int[]{11, 11};
//        String[] keyInput = new String[]{"down", "down", "down", "down", "down"};
//        int[] board = new int[]{7, 9};
        String[] keyInput = new String[]{"down", "down", "down", "down", "down", "down", "left", "right", "up", "right", "right", "right", "right", "right", "right"};
        int[] board = new int[]{11, 11};

//        String[] keyInput = new String[]{"left", "left", "left", "right"};
//        int[] board = new int[]{3, 3};
        int[] arr = s.solution(keyInput, board);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
