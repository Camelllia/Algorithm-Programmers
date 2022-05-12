import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        StringBuilder sb = new StringBuilder(new String(charArr, 0, charArr.length));

        String answer = sb.reverse().toString();
        return answer;
    }
}