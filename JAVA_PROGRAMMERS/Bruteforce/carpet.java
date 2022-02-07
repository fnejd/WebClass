
public class carpet {

	public static void main(String[] args) {
		
		
		//완전 탐색 -> 3.카펫 (Level 2)
		
		int brown = 24;
		int yellow = 24;
		for(int i: solution(brown, yellow)) {
			System.out.print(i+" ");
		}

	}

	public static int[] solution(int brown, int yellow) {
		
		//전체 격자의 수 -> 노란격자 개수 + 갈색 격자의 개수 
		//가로의 길이가 세로의 길이보다 같거나 길다. 
		//카펫의 가로 세로 길이 :  전체 격자의 수의 약수  (가로의 길이 * 셀의 길이 = 전체 격자의 수)
		// 노란 격자가 1개 있을 때 -> 가로 길이 : 3 	, 세로 길이 : 3 
		//(가로의 길이 - 양 사이드 2개) * (세로의 길이 - 양 끝 사이드 2개) = 노란 격자의 수 
		
		//가로, 세로 길이 담을 배열
		int[] answer = new int[2];
		
		//전체 타일의 개수 
		int all = brown + yellow;
		
		//가로 길이는  3이상이며  all전체 타일 개수보다 작다. (노란 격자가 1개 일때 최소 가로3 세로3)
		for(int i=3; i<all; i++) {
			//가로가 전체 타일 개수의 약수인지 확인  (가로 * 세로 -> 전체 타일의 개수)
			//세로 길이가 3이상인지 확인
			if(all%i==0 && all/i >=3) {
				
				int tmp = all/i;
				//가로의 길이는 세로 길이 보다 같거나 길다. 
				int col = Math.max(i, tmp);
				int row = Math.min(i, tmp);
				//노란 색 타일의 개수 
				int y = (col-2)*(row-2);
				
				//가능한 노란색 타일의 개수가 노란색 타일의 개수와 일치하는 지 확인 
				if(y==yellow) {
					answer[0] = col;
					answer[1] = row;
					
					return answer;
				}
				
			}
		}
		
		
        
        return answer;
    }
}
