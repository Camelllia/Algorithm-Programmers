#include <vector>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;

    if (arr.size() == 1)
    {
        answer.push_back(arr[0]);
        return answer;
    }

    for (int i = 0; i < arr.size() - 1; i++)
    {
        if (arr[i] == arr[i + 1])
        {
            int idx = i;
            while (true)
            {
                if (arr[idx] != arr[idx + 1])
                {
                    break;
                }
                else
                {
                    idx++;
                }
            }
            answer.push_back(arr[idx]);
            i = idx;
        }
        else
        {
            answer.push_back(arr[i]);
        }

        if (i + 1 == arr.size() - 1)
        {
            if (arr[i + 1] != arr[i])
            {
                answer.push_back(arr[i + 1]);
            }
        }
    }

    return answer;
}