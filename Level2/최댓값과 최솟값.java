class Solution {
    public String solution(String s) {

        String answer = "";

        String[] nums = s.split(" ");

        int maxValue = Integer.parseInt(nums[0]);
        int minValue = Integer.parseInt(nums[0]);

        for(int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, Integer.parseInt(nums[i]));
            minValue = Math.min(minValue, Integer.parseInt(nums[i]));
        }

        answer += minValue + " " + maxValue;

        return answer;
    }
}