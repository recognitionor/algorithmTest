package backjoon;

public class test_2018 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            for(int i = 0 ; i < arr1.length ; ++i){
                for(int j = 0 ; j < arr2[0].length ; ++j){
                    for(int k = 0 ; k < arr1[0].length ; ++k) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            return answer;
        }
    }

    public void main(String[] args) {
        Solution s = new Solution();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        s.solution(arr1, arr2);


    }
}
