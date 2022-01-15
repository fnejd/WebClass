import java.util.Scanner;

public class num_10950 {
	public static void main(String[] args) {
		
		// A + B -3
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 개수 입력
		int num = sc.nextInt();
		
		
		int a, b;
		
		for(int i=0; i<num; i++) {
			// 서로 더할 정수 2개 입력
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
		
		
	}

}
