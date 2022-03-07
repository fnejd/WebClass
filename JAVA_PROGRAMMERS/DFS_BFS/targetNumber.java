
public class targetNumber {

	public static void main(String[] args) {
		
		//DFS, BFS -> 1. 타겟 넘버 (level 2)
		
		int[] numbers = {1,1,1,1,1};
		
		int target = 3;
		
		System.out.println(solution(numbers, target));

	}
	
	static int cnt = 0;
	
	public static int solution(int[] numbers, int target) {
        
		dfs(numbers,target, 0, 0);
		
		//타겟 넘버를 만족하는 경우의 수
		return cnt;
    }
	
	public static void dfs(int[] numbers, int target, int length, int sum) {
		
		if(length==numbers.length) {
			//numbers의 숫자를 모두 거쳤을 경우
			
			if(sum==target) {
				//numbers의 숫자들을 더하거나 빼서 target과 일치할 경우
				
				cnt++;
			}
			
		}else {
			//numbers의 숫자를 더하거나 뺴면서 sum에 누적시키기 
			
								//더하거나 뺀 숫자의 개수, 누적 합계 
			
			dfs(numbers, target, length+1, sum+numbers[length]);
			dfs(numbers, target, length+1, sum-numbers[length]);
			
		}
		
	}

}
