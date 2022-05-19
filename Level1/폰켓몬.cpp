#include <vector>
#include <set>

using namespace std;

int solution(vector<int> nums)
{
    int answer = 0;
    int pivot = nums.size() / 2;

    set<int> pocket;

    for (int i = 0; i < nums.size(); i++)
    {
        pocket.insert(nums[i]);
    }

    if (pocket.size() >= pivot)
    {
        return pivot;
    }
    else
    {
        return pocket.size();
    }

    return answer;
}