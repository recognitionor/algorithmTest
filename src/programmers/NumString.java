package programmers;

import java.util.HashMap;

/*https://school.programmers.co.kr/learn/courses/30/lessons/81301*/
public class NumString {

    public static void main(String[] args) {
        class Solution {
            public int solution(String s) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("zero", 0);
                map.put("one", 1);
                map.put("two", 2);
                map.put("three", 3);
                map.put("four", 4);
                map.put("five", 5);
                map.put("six", 6);
                map.put("seven", 7);
                map.put("eight", 8);
                map.put("nine", 9);
                int answer = 0;
                for (String str : map.keySet()) {
                    if (s.contains(str)) {
                        System.out.println(str + ", " + map.get(str).toString());
                        String val = map.get(str).toString();
                        s = s.replaceAll(str, val);
                    }
                }
                answer = Integer.valueOf(s);
                return answer;
            }
        }
        Solution s = new Solution();
        System.out.println(s.solution("one4seveneight"));
    }
}
