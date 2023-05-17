package etc_exam;

import java.util.ArrayList;

/* 트럭 이동 문제*/
public class TruckMoveTest {
    public static void main(String[] args) {

        class MyQueue {
            private ArrayList<Integer> queue = new ArrayList<>();

            void enqueue(int item) {
                queue.add(queue.size(), item);
            }

            int peek() {
                return queue.get(0);
            }

            int dequeue() {
                int temp = queue.get(0);
                queue.remove(0);
                return temp;
            }

            int getTotalWeight() {
                int total = 0;
                for (int i = 0; i < queue.size(); i++) {
                    total += queue.get(i);
                }
                return total;
            }
        }
        class Solution {
            public int solution(int bridge_length, int weight, int[] truck_weights) {
                MyQueue mq = new MyQueue();
                int answer = 1;
                int truckNum = 0;

                mq.enqueue(truck_weights[truckNum]);
                do {
                    int nextTruckWeight = 0;
                    if (truck_weights.length > truckNum + 1) {
                        nextTruckWeight = truck_weights[truckNum + 1];
                    }
                    for (int i = 0; i < bridge_length; i++) {
                        answer++;
                        if ((mq.getTotalWeight() + nextTruckWeight) > weight) {
                            mq.enqueue(0);
                        } else {
                            truckNum++;
                            if (truck_weights.length > truckNum + 1) {
                                mq.enqueue(truck_weights[truckNum]);
                            }
                        }
                    }
                    mq.dequeue();
                    if (mq.getTotalWeight() + nextTruckWeight > weight) {
                        answer++;
                        truckNum++;
                        if (truck_weights.length > truckNum + 1) {
                            mq.enqueue(truck_weights[truckNum]);
                        }
                    }
                } while (truck_weights.length >= truckNum + 1);
                System.out.println(answer);
                return answer;
            }
        }

        Solution s = new Solution();
        s.solution(100, 100, new int[]{10});
    }


}
