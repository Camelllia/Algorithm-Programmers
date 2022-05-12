import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        List<String> list = Arrays.asList(seoul);

        int loc = list.indexOf("Kim");

        answer = "김서방은 " + loc + "에 있다";

        return answer;
    }
}