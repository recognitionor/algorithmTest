package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class PairRemove {

    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                Stack<Character> stack = new Stack<>();
                for (char c : s.toCharArray()) {
                    System.out.println("c : " + c);

                    if (!stack.isEmpty() && stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
                return stack.isEmpty() ? 1 : 0;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution("abba"));
    }
}
