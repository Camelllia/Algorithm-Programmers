class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalMoney = 0;

        for(int i = 1; i <= count; i++) {
            totalMoney += price * i;
            System.out.println(price * i);
        }

        answer = money - totalMoney;
        if(answer < 0) {
            answer = Math.abs(answer);
        } else  {
            answer = 0;
        }

        return answer;
    }
}