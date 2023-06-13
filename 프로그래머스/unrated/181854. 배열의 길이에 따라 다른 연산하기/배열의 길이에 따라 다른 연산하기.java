class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        //조건1: arr길이가 홀수인지
        if(arr.length%2!=0){
            for(int i=0; i<arr.length; i++){
             //홀수라면 짝수에 n값 더하기
            if(i%2==0){
                answer[i] = arr[i]+n;
            } else{
                answer[i] = arr[i];
            }
        } 
        }else {
            for(int i=0; i<arr.length; i++){
                if(i%2!=0){
                    answer[i] = arr[i]+n;
                } else{
                    answer[i] = arr[i];
                }
            }
        }
        
        return answer;
    }
}