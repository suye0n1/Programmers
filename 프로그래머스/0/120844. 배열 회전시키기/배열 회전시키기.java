class Solution {
    public int[] solution(int[] numbers, String direction) {
       //int[] answer = {};
        //배열 만들기
        int[] list = new int[numbers.length];
        
            //direction 조건
            if(direction.equals("right")){
               list[0] = numbers[numbers.length-1];
                for(int i = 1; i < numbers.length; i++){
                    list[i] = numbers[i-1];
                }
            }
            else{
                 list[list.length-1] = numbers[0];
                for(int j = 0; j < numbers.length-1; j++){
                    list[j] = numbers[j+1];
                }
            }
        return list;
    }
}