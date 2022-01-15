import java.util.Scanner;

public class num_8393 {
	public static void main(String[] args) {
		
		//합
		
		Scanner sc = new Scanner(System.in);
		
		//숫자 입력 받기
		int num = sc.nextInt();
		int sum = 0;
		
		//1~입력 받은 숫자까지의 합
		for(int i=1; i<= num ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
