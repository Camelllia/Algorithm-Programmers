import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
                size++;
            }
        }

        if(size == 0) {
            int[] dump = new int[1];
            dump[0] = -1;
            return dump;
        }

        Collections.sort(list);
        int[] answer = new int[size];


        int idx = 0;
        for (int element : list) {
            answer[idx] = list.get(idx);
            idx++;
        }

        return answer;
    }
}