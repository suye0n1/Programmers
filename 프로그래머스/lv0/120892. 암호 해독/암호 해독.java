class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] list = cipher.split("");
        for(int i=code-1; i<list.length; i = i+code){
                answer += list[i];
        }
        return answer;
    }
}