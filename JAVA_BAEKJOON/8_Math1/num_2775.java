import java.util.Scanner;

public class num_2775 {

	public static void main(String[] args) {
		
		//부녀회장이 될테야
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			//층 입력
			int a = sc.nextInt();
			//호수 입력
			int b = sc.nextInt();
			
			//아랫층 인원 수
			int num = 0;
			
			//a층의 b호 기준
			//층이 0부터 시작해서 a까지인 것을 고려해 a+1 개의 행 생성
			//호수는 1부터 시작. 0열은 비우고 1~b열을 고려해서 b+1 개의 열 생성
			int ap[][] = new int[a+1][b+1];
			
			//0층의 호수 -> i호는 i명 거주
			//0층의 각 호수에 거주하는 인원 채우기
			for(int k=1; k<=b; k++) {
				ap[0][k] = k;
			}
			
			//1층이상의 호수의 거주 인원 구하기
			//a층 b호의 거주 인원은 바로 이전층 (a-1) 의 거주인원에 의해 결정된다. 
			for(int j = 0; j <= a-1; j++) {
				num = 0;
				//a층 b호의 인원 <- a-1층 1호 + a-1층 2호 + ... + a-1층 b호
				for (int k = 1; k<= b; k++) {
					num += ap[j][k];
					ap[j+1][k] = num;
				}
			}
			
			System.out.println(ap[a][b]);
			
		}
		
		sc.close();

	}

}
