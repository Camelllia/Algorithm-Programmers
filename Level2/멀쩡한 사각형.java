class Solution {
    public long solution(int w, int h) {

        long answer = 1;
        long g = 0;

        if(w > h) {
            g = gcd(w , h);
        } else {
            g = gcd(h, w);
        }

        answer = ((long) w * h) - (w + h - g);

        return answer;
    }

    long gcd(long a, long b) {

        long temp = 0;

        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}