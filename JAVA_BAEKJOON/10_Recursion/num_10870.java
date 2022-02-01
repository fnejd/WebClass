import java.util.Scanner;

public class num_10870 {

	public static void main(String[] args) {
		
		//피보나치 수 5
		
		Scanner sc = new Scanner(System.in);
		
		//n번 째 입력 받기
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
		
		sc.close();
		

	}
	
	//피보나치 함수 
	static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
