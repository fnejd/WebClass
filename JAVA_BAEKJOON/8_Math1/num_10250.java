import java.util.Scanner;

public class num_10250 {

	public static void main(String[] args) {
		
		//ACM 호텔 
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 입력
		int t = Integer.parseInt(sc.nextLine());
		
		
		for(int i=0; i<t; i++) {
			//층 수 입력
			int h = sc.nextInt();
			//방 수 입력
			int w = sc.nextInt();
			//손님의 번호 입력
			int n = sc.nextInt();
			
			//꼭대기 층이 아닐 경우
			
			int room = 100 * (n%h) + n/h + 1;
			
			//꼭대기 층일 경우
			if(n%h==0) {
				room = 100 * h + n/h;
			}
			System.out.println(room);
		}
		
		sc.close();
		
	}
}
