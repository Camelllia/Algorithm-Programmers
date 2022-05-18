class Solution {

    int dp[][] = new int[100001][4];

    int solution(int[][] land) {

        int answer = 0;

        // initial
        for(int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }

        // DP
        for(int i = 1; i < land.length; i++) {
            for(int j = 0; j < 4; j++) {
                if(j == 0) {
                    dp[i][0] = Math.max(Math.max(dp[i - 1][1], dp[i - 1][2]), dp[i - 1][3]) + land[i][j];
                } else if(j == 1) {
                    dp[i][1] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][2]), dp[i - 1][3]) + land[i][j];
                } else if(j == 2) {
                    dp[i][2] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][3]) + land[i][j];
                } else if(j == 3) {
                    dp[i][3] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]) + land[i][j];
                }
            }
        }

        for(int i = 0; i < 4; i++) {
            answer = Math.max(dp[land.length - 1][i], answer);
        }

        return answer;
    }
}