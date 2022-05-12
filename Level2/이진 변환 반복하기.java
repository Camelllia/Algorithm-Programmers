
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cntToZero = 0;
        int cntToConvert = 0;

        while (true) {

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    cntToZero++;
                }
            }
            s = s.replaceAll("0", "");

            int len = s.length();
            String temp = Integer.toBinaryString(len);
            s = temp;
            cntToConvert++;

            if(s.equals("1")) {
                break;
            }
        }

        answer[0] = cntToConvert;
        answer[1] = cntToZero;

        return answer;
    }
}