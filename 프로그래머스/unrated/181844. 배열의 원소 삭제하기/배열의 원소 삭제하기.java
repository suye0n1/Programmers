import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
       // int[] answer = {};
       List<Integer> answer = new ArrayList<>();
        
     //answer에 arr담기
        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }
    //delete_list와 비교해서 제거하기
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    // 원시 자료형인 int를 Integer 객체로 박싱
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
     
        return answer;
    }
}