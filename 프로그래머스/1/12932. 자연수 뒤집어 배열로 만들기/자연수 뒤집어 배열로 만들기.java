import java.util.*;

class Solution {
    public int[] solution(long n) {
        //int[] answer = {};
        //n을 문자로 변환
        String s = String.valueOf(n);
        //list에 n 담기
        String[] list = s.split("");
        //ArrayList에 거꾸로 담을 리스트 생성
        ArrayList<Integer> reverse_list = new ArrayList<>();
        
        //역순으로 ArrayList에 저장
        for(int i = list.length-1; i>=0; i--){
            reverse_list.add(Integer.parseInt(list[i]));
        }
        
        //ArrayList를 배열로 변환
        int[] answer = new int[reverse_list.size()];
        for(int j=0; j<answer.length; j++){
            answer[j] = reverse_list.get(j);
        }
        return answer;
    }
}