#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {

	vector<int> answer;

	int a = 0;
	int b = 0;
	int temp = 0;

	if (n > m)
	{
		a = n;
		b = m;
	}
	else
	{
		a = m;
		b = n;
	}

	while (true)
	{
		temp = a % b;
		a = b;
		b = temp;

		if (temp == 0)
		{
			answer.push_back(a);
			answer.push_back(n * m / a);
			break;
		}
	}

	return answer;
}