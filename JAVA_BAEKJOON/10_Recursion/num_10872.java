import java.util.Scanner;

public class num_10872 {

	public static void main(String[] args) {
		
		
		//팩토리얼 
		
		Scanner sc = new Scanner(System.in);
		
		//정수 n 입력 받기
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
		sc.close();
		

	}
	//factorial 함수 
	static int factorial(int n) {
		
		if(n<=1) return 1;
		
		return n* factorial(n-1);
		
 	}

}
