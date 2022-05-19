#include <string>
#include <vector>
#include <cmath>

using namespace std;

int isPrimeNum[1000001];

int solution(int n) {
    int answer = 0;

    for (int i = 2; i <= n; i++)
    {
        isPrimeNum[i] = i;
    }

    for (int i = 2; i <= sqrt(n); i++)
    {
        for (int j = i + i; j <= n; j += i)
        {
            isPrimeNum[j] = 0;
        }
    }

    for (int i = 2; i <= n; i++)
    {
        if (isPrimeNum[i] != 0)
        {
            answer++;
        }
    }

    return answer;
}