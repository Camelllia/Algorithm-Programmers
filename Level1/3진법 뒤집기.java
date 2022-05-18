class Solution {
    public int solution(int n) {
        int answer = 0;

        String step1 = Integer.toString(n, 3);

        System.out.println(step1);

        StringBuffer sb = new StringBuffer(step1);
        String step2 = sb.reverse().toString();

        System.out.println(step2);

        int step3 = Integer.parseInt(step2, 3);

        answer = step3;

        return answer;
    }
}