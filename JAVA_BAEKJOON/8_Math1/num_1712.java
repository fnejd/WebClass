import java.util.Scanner;

public class num_1712 {

	public static void main(String[] args) {
		
		//손익분기점
		
		Scanner sc = new Scanner(System.in);
		// a, b, c 입력 <- 21억 이하 자연수 
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long n  = 1;
		// a + b * n < c * n
		// a / (c - b) < n
		// n > 0
		

		//c < b인 경우 n = a / (c - b) + 1에서 음수가 되어버린다.
		//c = b인 경우 a / (c - b) + 1 에서 0으로 나누는 문제 발생
		
		if(c <= b) {
			n = -1;
			
		}else {
			// 손익 분기점은 a / (c - b)보다 커야한다. 
			n = a / (c - b) + 1;
		}
		
		System.out.println(n);
		
		
		sc.close();
		
		

	}

}
