package etc_exam;

public class MinCostClimbingStair {

    public static void main(String[] args) {
//        int[] cost = new int[]{10, 15, 20};
//        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] cost = new int[]{1, 2, 3, 4, 5, 6, 7};
        int case1 = 0, case2 = 0, current;
        for (int i = cost.length - 1; i >= 0; i--) {
            System.out.println(cost[i]);
            current = cost[i] + Math.min(case1, case2);
            case2 = case1;
            case1 = current;
        }
//        int result = Math.min(case1, case2);
//        System.out.println(result);
    }
}
