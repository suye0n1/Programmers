class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        //2차원배열 for문 생성
	    for(int i = 0; i < board.length; i++){
		    for(int j = 0; j < board[i].length; j++){
			//조건 i + j <= k일 때 answer에 넣기
			   if(i + j <= k){
				answer += board[i][j];
			}  
		    } 	
	    }
        return answer;
    }
}