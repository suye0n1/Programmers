class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        //my_string의 개수 구하기
	    int len = my_string.length();
	    //2차원 배열리스트 초기값 선언
	    String[][] arr = new String[len/m][m];
	    //my_string값 순번 초기화
	    int index = 0;
	    //arr에 글자 넣기	
	    for(int i = 0; i < arr.length; i++){
		    for(int j = 0; j < arr[i].length; j++){
			    arr[i][j] = Character.toString(my_string.charAt(index++));
		    } 
	    }

	    //c열에 있는 값만 가져오기
	    for(int x = 0; x < arr.length; x++){
			answer += arr[x][c-1];
	    }
        return answer;
    }
}