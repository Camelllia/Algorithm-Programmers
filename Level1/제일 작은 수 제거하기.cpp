#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) {

    if (arr.size() == 1)
    {
        vector<int> result;
        result.push_back(-1);
        return result;
    }

    vector<int> answer(arr.size() - 1);

    int smallest = 100000000;
    int targetIdx = 0;

    for (int i = 0; i < arr.size(); i++)
    {
        if (arr[i] < smallest)
        {
            targetIdx = i;
            smallest = min(smallest, arr[i]);
        }
    }

    arr.erase(arr.begin() + targetIdx);

    answer = arr;

    return answer;
}