class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] list = myString.split("");
        String s = "";
        for(int i=0; i<list.length; i++){
            if(list[i].equals("A")){
                s += list[i].replace(list[i], "B");
            } else{
                  s += list[i].replace(list[i], "A");
            }
        }
        
        if(s.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}