import java.util.Scanner;

public class num_2439 {
	public static void main(String[] args) {
		
		
		//별 찍기 - 2
		Scanner sc = new Scanner(System.in);
		
		
		//n 줄 입력
		int n = sc.nextInt();
		
		// 오른쪽 기준으로 별 정렬
		for(int i=1; i<= n; i++) {
			
			//줄이 증가할수록 공백 감소
			for(int j= n-i; j>0 ;j--) {
				System.out.print(" ");
			}
			
			//줄이 증가할수록 별의 개수 증가
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			
			//줄 바꿈
			System.out.println();
		}
		
		
		
	}

}
