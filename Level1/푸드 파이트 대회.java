class Solution2 {
    public String solution(int[] food) {
        String answer = "";
        final String water = "0";

        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 0) {
                answer += makeStr(food[i] / 2, i);
            } else {
                answer += makeStr((food[i] - 1) / 2, i);
            }
        }

        StringBuffer sb = new StringBuffer(answer);
        String reversedStr = sb.reverse().toString();

        answer = answer + water + reversedStr;

        return answer;
    }

    String makeStr(int length, int index) {
        String result = "";

        for(int i = 0; i < length; i++) {
            result += String.valueOf(index);
        }

        return result;
    }
}