import java.util.Scanner;

public class num_1193 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//대각선 줄 
		//c번째 줄의 분모 + 분자 -> c + 1
		
		int x = sc.nextInt();
		int sum = 0, tmp = 0;
		int c = 0;
		
		//sum은 c줄까지의 총 칸의 개수 
		//tmp는 c-1줄까지의 총 칸의 개수
		
		while(x > sum) {
			tmp = sum;
			c++;
			sum += c;
		}
		
		if(c%2==0) {
			//짝수번 째 줄은 분모의 숫자가 더 큰 분수에서 순서가 시작
			System.out.printf("%d/%d", x-tmp, c+1 -(x-tmp));
			
		}else {
			//1/1 제외하고 홀수 번째 줄은 분자의 숫자가 더 큰 분수에서 순서가 시작 
			System.out.printf("%d/%d", c+1 -(x-tmp), x-tmp);
		}
		

		
		sc.close();
	}

}
