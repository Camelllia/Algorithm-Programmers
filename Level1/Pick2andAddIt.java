import java.util.*;

// 프로그래머스
class 두 개 뽑아서 더하기 {

    public int[] arr = new int[101];
    public boolean[] isused = new boolean[101];
    public HashSet<Integer> set = new HashSet<>();

    public int[] solution(int[] numbers) {

        // combination
        func(0, 0, numbers);

        // set -> Array
        int[] answer = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int index = 0;
        while (iter.hasNext()) {
            answer[index] = iter.next();
            index++;
        }

        Arrays.sort(answer);

        return answer;
    }

    void func(int idx, int cnt, int[] numbers) {
        if(cnt == 2) {
            int tmp = 0;
            for(int i = 0; i < 2; i++) {
                tmp += numbers[arr[i]];
            }
            set.add(tmp);
            return;
        }

        for(int i = idx; i < numbers.length; i++) {

            if(!isused[i]) {
                isused[i] = true;
                arr[cnt] = i;
                func(idx + 1, cnt + 1, numbers);
                isused[i] = false;
            }
        }
    }
}