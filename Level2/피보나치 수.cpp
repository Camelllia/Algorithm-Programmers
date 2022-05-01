#include <string>
#include <vector>

using namespace std;

int dp[100001];

int solution(int n) {

    dp[0] = 0;
    dp[1] = 1;

    if (n == 0)
    {
        return dp[0];
    }
    else if (n == 1)
    {
        return dp[1];
    }

    for (int i = 2; i <= n; i++)
    {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
    }

    return dp[n];
}