import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        int[] success = new int[N + 2];
        int[] fail = new int[N + 2];
        HashMap<Integer, Float> map = new HashMap<Integer, Float>();

        for(int i = 0; i < stages.length; i++) {
            for(int j = 1; j <= stages[i]; j++) {
                success[j]++;
            }

            fail[stages[i]]++;
        }

        for(int i = 1; i <= N; i++) {
            float temp = 0;

            if(success[i] == 0) {
                temp = 0;
            } else {
                temp = (float) fail[i] / (float) success[i];
            }

            map.put(i, temp);
        }

        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));

        int[] answer = new int[map.size()];
        int idx = 0;

        for(Integer key : listKeySet) {
            answer[idx] = key;
            idx++;
        }

        return answer;
    }
}