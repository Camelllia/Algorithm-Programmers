#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;

    long double temp = sqrt(n);
    long long temp2 = (long long)temp;

    if (temp == temp2)
    {
        answer = (long long)pow(temp2 + 1, 2);
    }
    else
    {
        answer = -1;
    }

    return answer;
}