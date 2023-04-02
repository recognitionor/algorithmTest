package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class AlienDictionary {

    private static void permutation(String[] spell, ArrayList<String> strList, LinkedList<Integer> list, int[] check, int n, int r) {
        if (list.size() == r) {
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(spell[i]);
                System.out.print(i + " ");
            }
            strList.add(sb.toString());
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {//**중복 순열과 다른 점
            if (check[i] == 0) {//자기자신을 못뽑게 해야지 중복이 안됨(이미 뽑은 것은 뽑지 않도록 체크)
                check[i] = 1;//자기자신을 못뽑게 해야지 중복이 안됨
                list.add(i);
                permutation(spell, strList, list, check, n, r);
                list.removeLast();//해당 넘버를 다시 제거 (즉,뽑지 않고 다음 번호 뽑기위함)
                check[i] = 0;
            }
        }

    }

    public static void main(String[] args) {
        class Solution {

            public int solution(String[] spell, String[] dic) {
                int answer = 2;
                int length = spell.length;
                LinkedList<Integer> linkedList = new LinkedList<>();
                ArrayList<String> strList = new ArrayList<>();

                int[] check = new int[length];
                permutation(spell, strList, linkedList, check, length, length);
                HashSet<String> set = new HashSet<>(Arrays.asList(dic));
                for (String str : set) {
                    System.out.println(str);
                }
                for (String str : strList) {
                    System.out.println(str);
                    if (set.contains(str)) {
                        answer = 1;
                        return answer;
                    }
                }
                return answer;
            }
        }
        Solution s = new Solution();
        String[] spell = new String[]{"z", "d", "x"};
        String[] dic = new String[]{"def", "dww", "dzx", "loveaw"};
        System.out.println("result : " +   s.solution(spell, dic));
    }
}
