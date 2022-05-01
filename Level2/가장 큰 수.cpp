#include <string>
#include <cstring>
#include <algorithm>
#include <vector>

using namespace std;

bool compare(string a, string b)
{
    return a + b > b + a;
}

string solution(vector<int> numbers) {

    string answer = "";

    vector<string> vStr;

    for (int number : numbers)
    {
        vStr.push_back(to_string(number));
    }

    sort(vStr.begin(), vStr.end(), compare);

    if (vStr[0] == "0")
    {
        return "0";
    }
    else
    {
        for (string element : vStr)
        {
            answer += element;
        }
    }

    return answer;
}