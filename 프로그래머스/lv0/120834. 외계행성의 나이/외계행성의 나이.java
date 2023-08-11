class Solution {
    public String solution(int age) {
        String answer = "";
        String s = age+"";
        String[] list = s.split("");
        for(int i=0; i<list.length; i++){
            //97:a소문자
            answer += ((char)((Integer.parseInt(list[i])+97)));
        }

        return answer;
    }
}