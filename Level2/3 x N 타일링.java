class Solution {
    public int solution(int n) {

        int answer = 0;
        long MOD = 1000000007;

        long[] dp = new long[5001];

        dp[2] = 3;
        dp[4] = 11;

        for(int i = 5; i <= n; i++) {
            if(i % 2 != 0)
                continue;

            dp[i] = ((dp[i - 2] * 4 % MOD) - (dp[i - 4] % MOD) + MOD) % MOD;
        }

        return answer = Long.valueOf(dp[n]).intValue();
    }
}