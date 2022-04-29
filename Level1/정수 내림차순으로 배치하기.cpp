#include <stdlib.h>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b)
{
    return b < a;
}

long long solution(long long n) {

    long long answer = 0;

    string temp = to_string(n);

    sort(temp.begin(), temp.end(), compare);

    answer = stoll(temp);

    return answer;
}