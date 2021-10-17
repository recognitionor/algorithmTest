public class JoyStick {

    private static int converterStr(String str) {

        return (byte) str.charAt(0);

    }

    public static void main(String[] args) {
        class Solution {
            public int solution(String name) {
                int startIndex = 65;
                int endIndex = 90;
                int answer = 0;
                int alphabetCount = 26;
                char[] nick = name.toCharArray();

                for (int i = 0; i < name.length(); i++) {
                    int asciiNum = converterStr(name.substring(i, i + 1));
                    answer += Math.min(asciiNum - startIndex, endIndex - asciiNum + 1);
                }
                boolean[] checkList = new boolean[name.length()];
                int cnt = 0;

                for (int i = 0; i < nick.length; i++) {
                    if (nick[i] != 'A') {
                        cnt++;
                    } else checkList[i] = true;
                }
                System.out.println(cnt);
                int idx = 0;

                for(int i = 0 ; i < cnt ; ++i) {
                    if(checkList[idx]) {
                        int lidx = idx;
                        int ridx = idx;
                        int left = 0;
                        int right = 0;

                        while(checkList[lidx]) {
                            if(lidx == 0) lidx = nick.length - 1;
                            else lidx--;
                            left++;
                        }

                        while(checkList[ridx]) {
                            ridx = (ridx + 1) % nick.length;
                            right++;
                        }

                        if(left > right) {
                            idx = ridx;
                            answer += right;
                        } else {
                            idx = lidx;
                            answer += left;
                        }
                    }
                    checkList[idx] = true;
                }
                return answer;
            }
        }
        Solution s = new Solution();
        s.solution("JHAAAAAAAN");
    }
}
