#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;

    vector<int> num(n);

    for (int i = 0; i < n; i++)
    {
        num[i] = 1;
    }

    for (int i = 0; i < lost.size(); i++)
    {
        num[lost[i] - 1]--;
    }
    for (int i = 0; i < reserve.size(); i++)
    {
        num[reserve[i] - 1]++;
    }

    for (int i = 0; i < n; i++)
    {
        if (i == 0)
        {
            if (num[i + 1] == 0 && num[i] == 2)
            {
                num[i]--;
                num[i + 1]++;
            }
        }
        else if (i == n - 1)
        {
            if (num[i] == 0 && num[i - 1] == 2)
            {
                num[i]++;
                num[i - 1]--;
            }
            if (num[i] == 2 && num[i - 1] == 0)
            {
                num[i]--;
                num[i - 1]++;
            }
        }
        else
        {
            if (num[i] == 2)
            {
                if (num[i - 1] == 0 && num[i + 1] != 0)
                {
                    num[i]--;
                    num[i - 1]++;
                }
                else if (num[i - 1] == 0 && num[i + 1] == 0)
                {
                    num[i]--;
                    num[i - 1]++;
                }
                else if (num[i - 1] != 0 && num[i + 1] == 0)
                {
                    num[i]--;
                    num[i + 1]++;
                }
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        if (num[i] != 0)
        {
            answer++;
        }
    }

    return answer;
}