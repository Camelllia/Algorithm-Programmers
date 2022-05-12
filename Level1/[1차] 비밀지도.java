class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        System.out.println("dd");

        for(int i = 0; i < n; i++) {

            String temp1 = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);
            String change1 = "";
            String change2 = "";
            String line = "";

            if(temp1.length() < n) {
                int gap = n - temp1.length();
                for(int j = 0; j < gap; j++) {
                    change1 += "0";
                }
                change1 += temp1;
            }
            else {
                change1 = temp1;
            }
            if(temp2.length() < n) {
                int gap = n - temp2.length();
                for(int j = 0; j < gap; j++) {
                    change2 += "0";
                }
                change2 += temp2;
            } else {
                change2 = temp2;
            }


            for(int k = 0; k < n; k++) {
                if(change1.charAt(k) == '0' && change2.charAt(k) == '0') {
                    line += ' ';
                }
                if(change1.charAt(k) == '1' || change2.charAt(k) == '1') {
                    line += '#';
                }
            }

            answer[i] = line;
        }

        return answer;
    }
}