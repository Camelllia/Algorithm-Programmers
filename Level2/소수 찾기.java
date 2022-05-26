import java.util.Arrays;

class Solution {

    char[] arr = new char[11];
    boolean[] isUsed = new boolean[11];
    int answer = 0;
    char[] nums;

    boolean[] primeTable = new boolean[10000000];

    public int solution(String numbers) {

        nums = numbers.toCharArray();

        for(int i = 0; i < numbers.length(); i++) {
            permutation(0, i + 1, nums);
        }

        return answer;
    }

    boolean isPrimeNumber(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    void permutation(int k, int m, char[] nums) {
        if(m == k) {
            String str = "";
            for(int i = 0; i < m; i++) {
                str += arr[i];
            }
            int num = Integer.parseInt(str);
            if(primeTable[num] == true) {
                num = 0;
            }
            if(isPrimeNumber(num)) {
                primeTable[num] = true;
                answer++;
            }
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!isUsed[i]) {
                isUsed[i] = true;
                arr[k] = nums[i];
                permutation(k + 1, m, nums);
                isUsed[i] = false;
            }
        }
    }
}