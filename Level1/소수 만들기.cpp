#include <vector>
#include <iostream>
using namespace std;

int result = 0;
int arr[1001];
bool isused[1001];

bool isPrimeNumber(int n)
{
    if (n == 1)
    {
        return false;
    }
    else if (n == 2)
    {
        return true;
    }

    for (int i = 3; i <= n - 1; i++)
    {
        if (n % i == 0)
        {
            return false;
        }
    }
    return true;
}

void func(int idx, int cnt, vector<int> nums)
{
    int temp = 0;

    if (cnt == 3)
    {
        for (int i = 0; i < 3; i++)
        {
            temp += arr[i];
        }
        if (isPrimeNumber(temp))
        {
            result++;
        }
        return;
    }

    for (int i = idx; i < nums.size(); i++)
    {
        if (!isused[nums[i]])
        {
            isused[nums[i]] = true;
            arr[cnt] = nums[i];
            func(i + 1, cnt + 1, nums);
            isused[nums[i]] = false;
        }
    }
}

int solution(vector<int> nums) {

    int answer = -1;

    func(0, 0, nums);

    answer = result;

    return answer;
}