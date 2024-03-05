import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
         //int[] answer = {};
        List<Integer> stk_list = new ArrayList<>();
	for(int i = 0; i < arr.length; i++){
	    // stk가 빈 배열일 경우 arr[i]를 stk에 추가하고 i에 1을 더하기
	    if(stk_list.isEmpty()){
		   stk_list.add(arr[i]);
	    }
	  //stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더하기
	  else if(stk_list.get(stk_list.size()-1) == arr[i]){
			stk_list.remove(stk_list.size()-1);
	  }
	 //stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더하기
	else{
		stk_list.add(arr[i]);
	}
	}
    
    //빈 배열을 return할 경우 [-1]
	if(stk_list.isEmpty()) {
            stk_list.add(-1);
    }
        
    int[] answer = new int[stk_list.size()];
        for (int j = 0; j < stk_list.size(); j++) {
            answer[j] = stk_list.get(j);
        }
        
        return answer;
    }
}