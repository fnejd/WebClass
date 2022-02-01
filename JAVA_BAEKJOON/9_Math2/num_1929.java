import java.util.Scanner;

public class num_1929 {

	public static void main(String[] args) {
		
		
		//소수 구하기
		
		//에라토스테네스의 체 이용
		
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//false로 초기화 
		
		boolean[] arr = new boolean[b+1];
		
		//1은 소수가 아니므로 true 대입
		arr[1] = true;
		
		//소수가 아니면 true, 소수이면 false로 설정
		//입력 받은 두 수 a,b에서 b까지의 수 중에서 소수 여부 판별
		for(int i=2; i<=b; i++) {
			
			//소수가 아니므로 건너뛴다. 
			if(arr[i]==true) {
				continue;
			}
			
			//i는 소수이다. 
			//소수의 배수는 소수가 아니므로 소수 여부 판별을 위한 배열에 true를 대입한다. 
			for(int j=i+i; j<=b; j = j+i) {
				arr[j] = true;
			}
			
		}
		
		for(int i=a; i<=b; i++) {
			//arr[i]의 값이 false면 소수이다
			if(arr[i] == false) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	
		
	}

}
