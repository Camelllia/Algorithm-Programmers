class Solution {
    public int solution(String dartResult) {

        int answer = 0;
        double curNum = 0;
        double befNum = 0;

        for(int i = 0; i < dartResult.length(); i++) {

            if(Character.isDigit(dartResult.charAt(i))) {
                int idx = i + 1;
                curNum = Character.getNumericValue(dartResult.charAt(i));
                if(Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                    curNum = 10;
                    idx++;
                }
                while (true) {
                    if(dartResult.charAt(idx) == 'S') {
                        curNum = curNum;
                    } else if(dartResult.charAt(idx) == 'D') {
                        curNum = Math.pow(curNum, 2);
                    } else if(dartResult.charAt(idx) == 'T') {
                        curNum = Math.pow(curNum, 3);
                    } else if(dartResult.charAt(idx) == '*') {
                        curNum *= 2;
                        befNum *= 2;
                    } else if(dartResult.charAt(idx) == '#') {
                        curNum *= -1;
                    }

                    if(idx == dartResult.length() - 1) {
                        answer += curNum;
                        answer += befNum;
                        return answer;
                    }
                    if(Character.isDigit(dartResult.charAt(idx))) {
                        answer += befNum;
                        befNum = curNum;
                        i = idx - 1;
                        break;
                    }
                    idx++;
                }
            }
        }


        return answer;
    }
}