class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        boolean flag = false;

        if(s.length() != 4) {
            System.out.println("1");
            flag = true;
            return false;
        }
        if(s.length() != 6 && flag == true) {
            System.out.println("2");
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                System.out.println("3");
                return false;
            }
        }
        return true;
    }
}