#include <string>
#include <vector>
#define MOD 1234567

using namespace std;

long long dp[60001];

long long solution(int n) {
    int answer = 0;

    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 3;

    for (int i = 4; i <= n; i++)
    {
        dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
    }

    answer = dp[n];

    return answer;
}