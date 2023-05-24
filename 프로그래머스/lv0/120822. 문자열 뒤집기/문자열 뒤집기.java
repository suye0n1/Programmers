import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //문자열을 list에 저장
        List<String> list= new ArrayList<>();
        //끝에서부터 list에 저장
        for(int i=my_string.length()-1; i>=0; i--){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        //list를 answer에 담기
        for(String s: list){
            answer += s;
        }
        return answer;
    }
}