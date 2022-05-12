import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public Object[] solution(long n) {
        Object[] answer = {};

        String str = Long.toString(n);
        Integer[] arr = new Integer[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        answer = list.toArray();

        return answer;
    }
}