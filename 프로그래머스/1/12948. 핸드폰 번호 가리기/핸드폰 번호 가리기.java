class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] list_phone_number = phone_number.split("");
        for(int i = 0; i < list_phone_number.length; i++){
            if(i < list_phone_number.length - 4){
                list_phone_number[i] = "*";
                answer += list_phone_number[i];
            }
            else{
               answer += list_phone_number[i];
            }
        }
        return answer;
    }
}