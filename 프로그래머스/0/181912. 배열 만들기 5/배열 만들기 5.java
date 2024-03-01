import java.util.*;

class Solution {
      public int[] solution(String[] intStrs, int k, int s, int l) {
       	//int[] answer = {};
	    //문자열 잘라서 넣을 list 생성
	    int[] list = new int[intStrs.length];

	    //for문 : substring 사용해서 문자열 자르기
	    for(int i = 0; i < intStrs.length; i++){
		    list[i] = Integer.parseInt(intStrs[i].substring(s, s+l));
	    }
	    //k보다 큰 값만 ArrayList에 넣기
       ArrayList<Integer> arr_list  = new ArrayList<>();
       for(int value : list){
		if(value > k){
			arr_list .add(value);
		}
	}

	    // ArrayList를 int[] 배열로 변환
	    int[] answer = new int[arr_list.size()];
	    for(int x = 0; x < answer.length; x++){
		    answer[x] = arr_list.get(x);
	    }

    return answer;
    }
}