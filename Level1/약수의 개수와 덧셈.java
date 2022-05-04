class Solution {
    public int solution(int left, int right) {

        int answer = 0;

        // Get
        for(int k = left; k <= right; k++) {
            int temp = 0;
            for(int i = 1; i * i <= k; i++) {
                if(k % i == 0) {
                    temp++;
                    if(i * i < k) {
                        temp++;
                    }
                }
            }

            // Result Calculate
            if(temp % 2 == 0) {
                answer += k;
            } else {
                answer -= k;
            }
        }

        System.out.println(answer);

        return answer;
    }
}