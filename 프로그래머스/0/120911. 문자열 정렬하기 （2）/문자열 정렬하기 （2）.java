import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //my_string 소문자로 바꾸기
	    String lc_my_string = my_string.toLowerCase();
	    //정렬하고 리스트 생성
	    String[] list = lc_my_string.split("");
	    //오름차순으로 정렬
	    Arrays.sort(list);
	    //for문 돌려서 answer 출력
	    for(int i = 0; i < list.length; i++){
		    answer += list[i];
	    }
        return answer;
    }
}