import java.util.Arrays;

public class k_number {

	public static void main(String[] args) {
		
		// 정렬 - > 1. k번째 수 
		
		int[] arr = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}};
		
		int[] a =solution(arr,commands);
		
		for(int i: a) {
			System.out.println(i);
		}
		

	}

	public static int[] solution(int[] array, int[][] commands) {
		
		//commands의 행의 개수 만큼 정답을 담을 배열 
		int[] answer = new int[commands.length];
		
		
		for(int s=0; s<commands.length; s++) {
			
			//i,j,k 입력 받기 
			int i= commands[s][0];
			int j= commands[s][1];
			int k = commands[s][2];
			
			//배열에서 i번째 숫자에서 j번째 숫자까지 자른후 이를 담을 배열 생성
			int[] tmp = new int[j-i+1];
			
			//tmp 배열에 값을 입력하기 위해 이용하는 index
			int index=0; 
			
			//배열에서 i번쨰 숫자에서 j번째 숫자까지 자르고 tmp에 해당 범위에 있는 숫자들을 저장
			for(int idx = i-1; idx< j; idx++) {
				tmp[index++] = array[idx];
				
			}
			
			//정렬
			Arrays.sort(tmp);
			
			//정렬 후 k번째에 있는 수 구하기 (인덱스는 0부터 이므로 인덱스에 k-1)
			answer[s] = tmp[k-1];
			
		}
		

		return answer;
	}

}


