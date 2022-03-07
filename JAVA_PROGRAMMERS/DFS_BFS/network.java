
public class network {

	public static void main(String[] args) {
		
		//DFS, BFS -> 2. 네트워크 (level 3)
		
		//컴퓨터의 개수
		int n = 3;
		
		//컴퓨터 연결 상태
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		
		System.out.println(solution(n,computers));

	}
	
	
	
	public static int solution(int n, int[][] computers) {
		
        int answer = 0;
        
        //연결 여부 확인한 컴퓨터인지 체크하는 배열
        boolean[] check = new boolean[n];
        
        for(int i=0; i<n; i++) {
        	
        	//연결 여부 아직 확인 안 한 컴퓨터의 경우
        	if(!check[i]) {
        		
        		//네트워크 개수 추가 (지금까지 다른 컴퓨터와 연결이 없었다)
        		answer++;
        		
        		//해당 컴퓨터와 네트워크가 연결된 컴퓨터가 있는지 확인하기
        		dfs(check, computers, i);
        		
        		
        		
        	}
        }

        return answer;
    }
	
	
	public static void dfs(boolean[] check, int[][] computers, int i) {
		
		//연결 여부 확인으로 변경
		check[i]=true; 
		
		//컴퓨터의 연결 상태 확인
		for(int j=0; j<computers[i].length; j++) {
			
			//해당 컴퓨터와 네트워크가 연결된 컴퓨터 중에서 아직 확인하지 못한 컴퓨터
			if(!check[j]  && computers[i][j]==1) {
				
				dfs(check, computers, j);
			}
		}
		
		
	}
	

}
