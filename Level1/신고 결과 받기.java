import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reportMap = new HashMap<>();
        HashMap<String, Integer> infoMap = new HashMap<>();
        HashMap<Integer, String> idxMap = new HashMap<>();

        for(int i = 0; i < id_list.length; i++) {
            idxMap.put(i, id_list[i]);
            reportMap.put(id_list[i], new HashSet<>());
            infoMap.put(id_list[i], 0);
        }

        for (String element : report) {
            String[] action = element.split(" ");
            reportMap.get(action[1]).add(action[0]);
        }

        for (String user : id_list) {
            if(reportMap.get(user).size() >= k) {
                for (String name : reportMap.get(user)) {
                    infoMap.put(name, infoMap.get(name) + 1);
                }
            }
        }

        for(int i = 0; i < id_list.length; i++) {
            String targetName = idxMap.get(i);
            answer[i] = infoMap.get(targetName);
        }

        return answer;
    }
}