class Solution {
    public int solution(int n, int k) {

        int answer = 0;

        String str = Integer.toString(n, k);
        String temp = "";
        long param = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != '0') {
                temp += str.charAt(i);
                if(i == str.length() - 1) {
                    param = Long.parseLong(temp);
                    if(isPrimeNumer(param)) {
                        answer++;
                    }
                }
            }
            else {
                if(temp.equals("")) {
                    continue;
                }
                param = Long.parseLong(temp);
                if(isPrimeNumer(param)) {
                    answer++;
                }
                temp = "";
            }
        }

        return answer;
    }

    boolean isPrimeNumer(long n) {

        if(n == 1) {
            return false;
        }

        for(long i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}