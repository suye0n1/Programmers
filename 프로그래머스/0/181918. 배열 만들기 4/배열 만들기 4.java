import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
         //int[] stk = {};
        List<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length;){
	    //arr리스트 0번지 데이터를 str배열에 넣기
	    if(stk.size() == 0){
		stk.add(arr[i]);	
        i++;
	    }
         //stk의 마지막 원소가 arr[i]보다 작을 경우
	    else if(arr[i] > stk.get(stk.size()-1)){
		stk.add(arr[i]);
        i++;
	    }
	    //stk의 마지막 원소가 arr[i]보다 크거나 같을 경우
        else{
		stk.remove(stk.size()-1);
        }
        }
        //Integer를 int형식으로 변환
        return stk.stream().mapToInt(i -> i).toArray();
    }
}