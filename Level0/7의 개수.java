class Solution2 {
    public int solution(int[] array) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            String strElement = String.valueOf(array[i]);
            answer += sevenCheck(strElement);
        }

        return answer;
    }

    int sevenCheck(String strElement) {
        int cnt = 0;
        final char targetNum = '7';

        for(char charElement : strElement.toCharArray()) {
            if(charElement == targetNum) {
                cnt++;
            }
        }

        return cnt;
    }
}