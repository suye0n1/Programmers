class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] list = my_string.split("");
        String temp = "";
        temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
        //join : 배열의 요소들을 하나로 만들어주기
        answer = String.join("",list);
        return answer;
    }
}