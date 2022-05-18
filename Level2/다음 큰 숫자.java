class Solution {

    int originNum = 0;

    public int solution(int n) {
        int answer = 0;

        originNum = n;

        while (true) {
            n += 1;

            if(check(n) == true) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    boolean check(int n) {

        String temp1 = Integer.toString(originNum, 2);
        String temp2 = Integer.toString(n, 2);
        int temp1Cnt = 0;
        int temp2Cnt = 0;

        for(int i = 0; i < temp1.length(); i++) {
            if(temp1.charAt(i) == '1') {
                temp1Cnt++;
            }
        }
        for(int i = 0; i < temp2.length(); i++) {
            if(temp2.charAt(i) == '1') {
                temp2Cnt++;
            }
        }

        if(temp1Cnt == temp2Cnt) {
            return true;
        } else {
            return false;
        }
    }
}