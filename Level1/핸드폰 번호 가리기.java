class Solution {
    public String solution(String phone_number) {
        String answer = "";

        if(phone_number.length() == 4) {
            return phone_number;
        }

        for(int i = phone_number.length() - 1; i > 0; i--) {
            System.out.println(phone_number.charAt(i));
            if(phone_number.length() - 5 < i) {
                continue;
            } else {
                phone_number = phone_number.substring(0, i) + "*" + phone_number.substring(i + 1);
            }
        }

        phone_number = phone_number.substring(0, 0) + "*" + phone_number.substring(1);
        answer = phone_number;

        return answer;
    }
}