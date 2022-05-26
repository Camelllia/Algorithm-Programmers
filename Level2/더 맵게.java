import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {

        int answer = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            pq.add((long) scoville[i]);
        }

        while (true) {

            if(pq.size() == 1) {
                return -1;
            }

            Long firstFood = pq.poll();
            Long secondFood = pq.poll();
            Long newFood = firstFood + (secondFood * 2);

            pq.add(newFood);
            answer++;

            if(pq.peek() >= K) {
                break;
            }
        }
        return answer;
    }
}