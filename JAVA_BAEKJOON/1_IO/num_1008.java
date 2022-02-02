import java.util.Scanner;

public class num_1008 {
	public static void main(String[] args) {
		
		//A/B
		
		//두 정수 A와 B를 입력받고 A/B를 출력
		//상대오차가 10 ^(-9) 이하
		
		Scanner sc = new Scanner(System.in);
		int a ,b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println((double)a/b);
		
		sc.close();
	}

}
