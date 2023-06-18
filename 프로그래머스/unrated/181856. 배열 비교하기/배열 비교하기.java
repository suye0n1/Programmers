class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int ar1 = 0;
        int ar2 = 0;
        if(arr1.length < arr2.length){
            answer = -1;
        } else if(arr1.length > arr2.length) {
            answer = 1;
        } else{
            for(int i=0; i<arr1.length; i++){
                ar1 += arr1[i];
            }
        for(int j=0; j<arr2.length; j++){
              ar2 += arr2[j];
        }
        if(ar1 > ar2){
            answer = 1;
        } else if(ar1 < ar2){
            answer = -1;
        } 
    }
        return answer;
    }
}