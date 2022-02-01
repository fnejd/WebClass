import java.util.Scanner;

public class num_9020 {
	
	public static void main(String[] args) {
		
		
		// 골드바흐의 추측 
		
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력 받기
		int T = sc.nextInt();
		
		//소수인지 여부를 판별하기 위한 배열
		boolean[] arr;
		
		
		for(int i=0; i<T; i++){
			
			//짝수를 입력 받는다. 
			int n = sc.nextInt();
			
			 //소수 여부 담는 배열 (false - 소수)
			arr= new boolean[n+1];
			
			
			for(int j=2; j<=n;j++ ){
				
				//소수가 아니므로 건너뛴다. 
				if(arr[j]==true) {
					continue;
				}
				
				//소수의 배수는 소수가 아니므로 배열의 값에 true 대입
				for(int k=2; j*k<=n; k++) {
					
					arr[j*k] = true;
				}
				
			}
			
			
			//소수인 두 수의 합이 n을 만족해야 한다. ex) j, n-j
			//두 소수의 차이가 가장 작은 경우에 출력한다. 
			for(int j=n/2; j>1;j--) {
				//j와 n-j의 합은 n
				//j와 n-j은 소수여야 한다. 둘다 arr 배열의 값이 false여야 한다.
				if(arr[j]==false && arr[n-j]==false) {
					//j와 n-j 의 차이가 가장 작은 경우에 출력해야 한다.
					//둘의 차이가 가장 작으려면 j = n/2 일때 부터 고려하면된다.
					//j = n/2면 n-j = n/2 이므로 차이가 가장 작다.
					// (j = n/2 -1) (n-j = n/2+1) ...
					System.out.printf("%d %d\n",j, n-j);
					break;
				}
			}
			

			

			
		}
		
		sc.close();
	}
}
