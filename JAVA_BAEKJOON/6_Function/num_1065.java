import java.util.Scanner;

public class num_1065 {
	
	public static void main(String[] args) {
		
		//한수
		
		
		Scanner sc = new Scanner(System.in);
		
		//자연수 n 입력
		int n = sc.nextInt();
		
		//한수의 개수
		int ans = 0;
		
		if(n < 100) {
			//1~99까지는 입력받은 숫자가 곧 한수의 개수
			ans = n;
			
		}else{
			//입력 받은 숫자가 100이상 일 경우
			//1~100까지 한수의 개수인 99개에 100~n까지의 수 중 한수의 개수를 추가해 준다. 
			
			ans = 99;
			
			if(n == 1000) {
				//1000보다 같거나 작은 n을 입력 받는다. 
				//1000은 한수가 아니어서 999와 한수의 개수가 동일
				
				n=999;
			}
			
			for(int i=100; i<=n; i++) {
				//일의 자리수
				int o = i %10;
				//십의 자리수 
				int t = i / 10 % 10;
				//백의 자리수
				int h = i / 100;
				
				//(백의자리 수 - 십의 자리수)와 (십의 자리수 - 일의 자리수) 동일 할 때 한수 개수 증가
				if((h-t) == (t-o)) {
					ans++;
				}
			}
			
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
