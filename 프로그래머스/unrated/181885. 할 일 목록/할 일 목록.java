import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> finishedList = new ArrayList<>();
        //finished가 false라면  
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                finishedList.add(todo_list[i]);
            }
        }
         
        return finishedList;
    }
}