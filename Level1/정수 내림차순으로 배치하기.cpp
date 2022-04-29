#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b)
{
    return b < a;
}

vector<int> solution(vector<int> arr) {
    vector<int> answer;

    if (arr.size() == 1)
    {
        arr[0] = -1;
        answer = arr;
        return answer;
    }

    sort(arr.begin(), arr.end(), compare);

    arr.erase(arr.begin() + arr.size() - 1);

    answer = arr;

    return answer;
}